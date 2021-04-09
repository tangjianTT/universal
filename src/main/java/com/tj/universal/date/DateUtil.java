package com.tj.universal.date;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author TJ
 * @description TODO
 * @date 2020/12/29 17:13
 **/
public class DateUtil {

    public static Date getFetureDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + past);
        Date today = calendar.getTime();
        return today;
    }

    public static String getWeek(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String week = sdf.format(date);
        return week;
    }

    public static String getYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, 0);
        Date today = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("YYYY");
        String day = format.format(today);
        return day;
    }


    public static List<String> getFetureDateWeek(int intervals) {
        ArrayList<String> fetureDaysList = new ArrayList<>();
        for (int i = 1; i <= intervals; i++) {
            StringBuffer date = new StringBuffer();
            final Date fetureDate = getFetureDate(i);
           /* final String week = getWeek(fetureDate);*/
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String day = format.format(fetureDate);
           /* date.append(day).append(" ").append(week);*/
            date.append(day);
            fetureDaysList.add(String.valueOf(date));
        }
        return fetureDaysList;
    }



    public static boolean compareNow(String time1) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            //将字符串形式的时间转化为Date类型的时间
            Date a = sdf.parse(time1);
            Date b = new Date();
            //Date类的一个方法，如果a早于b返回true，否则返回false
            if (a.before(b)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }


}
