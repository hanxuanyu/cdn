import buyticket.TicketManager;
import inter.TicketResult;
import utils.LogUtils;
import utils.MSTTSSpeech;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;


public class Test
{
    public static void main(String[] args) {
        long time = 60;
        if (args.length >= 3){
            time = Integer.parseInt(args[2]);
        }
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                boolean needMoreInfo = false;
                String date = "2021-01-20";
                if (args.length >= 1){
                    date = args[0];
                }
                if (args.length >= 2){
                    if(args[1].equals("1")){
                        needMoreInfo = true;
                    }
                }
                MSTTSSpeech msttsSpeech = new MSTTSSpeech();
                msttsSpeech.setRate(2);
                TicketManager ticketManager = TicketManager.getInstance();
                ticketManager.getTicketsInfo(date, needMoreInfo, new TicketResult() {
                    @Override
                    public void onSuccess(String info, boolean isMore) {
                        LogUtils.Log("车次信息",info.replace("###"," "));
                        if (!isMore){
                            msttsSpeech.speak(info.split("###")[0]);
                        }
                    }

                    @Override
                    public void onFailed(String error) {
                        LogUtils.Log("error", error);
                    }
                });
            }
        },0, time*1000);
    }
}
