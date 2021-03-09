package buyticket;

import beans.ResultBean;
import com.google.gson.Gson;
import inter.TicketResult;
import okhttp3.Call;
import okhttp3.Response;
import sun.util.resources.cldr.vi.TimeZoneNames_vi;
import utils.NetUtils;

import java.io.IOException;
import java.util.List;

public class TicketManager {

    private static TicketManager mInstance;
    private static final byte[] LOCKER = new byte[0];


    private TicketManager(){

    }

    public static TicketManager getInstance() {
        if (mInstance == null){
            synchronized (LOCKER){
                if(mInstance == null){
                    mInstance = new TicketManager();
                }
            }
        }
        return mInstance;
    }

    public void getTicketsInfo(String date, boolean needMoreInfo, TicketResult ticketResult){
        String train_date = date;
        String from_station = "TNV";
        String to_station = "CUF";
        String url = "https://kyfw.12306.cn/otn/leftTicket/queryT?leftTicketDTO.train_date="+train_date+"&leftTicketDTO.from_station="+from_station+"&leftTicketDTO.to_station="+to_station+"&purpose_codes=ADULT";
        //System.out.println(url);
        String cookie = "_uab_collina=161036806347475390697769; JSESSIONID=F322F3A5D29D07ADDA27E5365E5FDB4C; BIGipServerotn=418382346.50210.0000; RAIL_EXPIRATION=1610687047542; RAIL_DEVICEID=eMrvabj3khhbBZ8FnVcA4RHawEfE0uxkktJKgjQ8R08XThGuBqEPiGvkLttGU1fh_OXifWiprAPeLsHs7rbZMEx536OTPQ22JsM8SC_zmGdXhJ7aE599GVhgBgyd2pjHzEBkURbS0zPoL4XCHNRqvVGnrMH1QkAb; BIGipServerpool_passport=182714890.50215.0000; route=9036359bb8a8a461c164a04f8f50b252; _jc_save_fromStation=%u592A%u539F%u5357%2CTNV; _jc_save_toStation=%u957F%u6CBB%u4E1C%2CCUF; _jc_save_toDate=2021-01-11; _jc_save_wfdc_flag=dc; _jc_save_fromDate=2021-01-20";
        NetUtils netUtils = NetUtils.getInstance();
        netUtils.getDataAsynFromNet(url, cookie, new NetUtils.MyNetCall() {
            @Override
            public void success(Call call, Response response) throws IOException {
                Gson gson = new Gson();
                String str = response.body().string();
                if(str.matches("\\{.*}")){
                    ResultBean resultBean = gson.fromJson(str, ResultBean.class);
                    List<String> result = resultBean.getData().getResult();
                    int i = 0; // 可预订
                    int j = 0; // 不可预订
                    StringBuilder sb = new StringBuilder();
                    for (String s : result) {
                        String[] split = s.split("\\|");
                        String trainId = split[3];
                        if (trainId.startsWith("D")||trainId.startsWith("G")){
                            if (split[1].equals("预订") && (!split[30].equals("无"))){
                                i++;
                            }else {
                                j++;
                            }
                            if(needMoreInfo){
                                String info = "车次: "+split[3]+"\t状态: "+split[1]+"\t发车时间:"+split[8]+"\t到达时间:"+split[9]+"\t历时:"+split[10]+"\t余票: "+"\t二等座("+split[30]+")"+"\t一等座("+split[31]+")"+"\t商务("+split[32]+")";
                                sb.append(info);
                                sb.append("\n");
                            }else {
                                if (split[1].equals("预订") && (!split[30].equals("无"))){
                                    String info = "车次: "+split[3]+"\t状态: "+split[1]+"\t发车时间:"+split[8]+"\t到达时间:"+split[9]+"\t历时:"+split[10]+"\t余票: "+"\t二等座("+split[30]+")"+"\t一等座("+split[31]+")"+"\t商务("+split[32]+")";
                                    sb.append(info);
                                    sb.append("\n");
                                }
                            }
                        }
                    }
                    String temp = date+" 共有"+i+"趟列车可预订,"+j+"趟不可预订";
                    String resultStr =  temp + "###\n" + sb.toString();
                    ticketResult.onSuccess(resultStr, needMoreInfo);
                }else {
                    System.out.println(str);
                }
            }

            @Override
            public void failed(Call call, IOException e) {
                ticketResult.onFailed(e.toString());
            }
        });
    }
}
