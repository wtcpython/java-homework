package cn.campsg.java.experiment;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {
    private DateUtils() {
    }

    public static String getSystemDate() {
        long times = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date(times));
    }

    public static String getSystemTime() {
        long times = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date(times));
    }
}
