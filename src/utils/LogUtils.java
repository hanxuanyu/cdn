package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtils {
    public static void Log(String tag, String str){
        long timeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = simpleDateFormat.format(new Date(timeMillis));
        System.out.println(date+"\t"+tag+"\t"+str);
    }
}
