package com.core.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: SunBC
 * @Date: 2018/12/3 14:24
 * @Description:
 */
public class DateUtils {
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss" ;
    public static final String DATE_FORMAT = "yyyy-MM-dd" ;
    public static final String DATE_FORMAT_CHINA = "yyyy年MM月dd日" ;
    public static final String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };

    //根据日期获取星期
    public static String dateToWeek(String datetime,DateTimeFormatter f )throws Exception {
        LocalDate localDate = LocalDate.parse(datetime, f);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int weekValue = dayOfWeek.getValue();
        return weekDays[weekValue];
    }
    /**
     * description: 日期到指定格式字符串
     * @auther: SunBC
     * @date: 2019/5/24 13:56
     */
    public  static  String DateToString(Date date , DateTimeFormatter dateTimeFormatter){
        if (date == null) return "";
        if (dateTimeFormatter == null) dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return LocalDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault()).format(dateTimeFormatter);
    }
    /**
     * description:
     * @auther: SunBC
     * @date: 2019/5/28 11:29
     */
    public  static  Date LocalDateToDate(LocalDate date){
        if (date == null) return null;
        Instant instant = date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }
    /**
     * description:
     * @auther: SunBC
     * @date: 2019/5/28 11:29
     */
    public  static  Date LocalDateTimeToDate(LocalDateTime date){
        if (date == null) return null;
        Instant instant = date.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }
    /**
     * description: 获取当前时间的格式化字符串
     * @auther: SunBC
     * @date: 2019/5/24 13:56
     */
    public  static  String NowToString(DateTimeFormatter dateTimeFormatter){
        if (dateTimeFormatter == null) dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        return LocalDateTime.now().format(dateTimeFormatter);
    }

    public static void main(String[] args)throws Exception {
//        System.out.println(DateToString(new Date(),DateTimeFormatter.ofPattern(DATE_FORMAT)));
//        System.out.println();
//        String ny = "2019-12";
//        String k = ny +"-01";
//        String j = ny + "-"+String.valueOf(LocalDate.parse(ny +"-01").lengthOfMonth());
//        System.out.println("起始："+k);
//        System.out.println("结束："+j);

    }

}
