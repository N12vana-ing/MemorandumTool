package com.zyk.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * 时间日期工具类
 *
 * Instant  时间戳
 * LocalDate  只包含日期，例如2020-02-03
 * LocalTime  只包含时间
 * LocalDateTime 包含日期和时间
 * Period  时间段
 * java.time.format.DateTimeFormatter  时间格式化
 *
 * @author zhouyuankai
 * @since 2021-01-16
 */
public class DateUtil {


    /**
     * 获取当前日期
     * @return
     */
    public static Date getNowDate(){
        LocalDate today = LocalDate.now();
        ZonedDateTime zonedDateTime = today.atStartOfDay(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    /**
     * 将localdate转换为Date
     * @param localDate
     * @return
     */
    public static Date changeLocalToDate(LocalDate localDate){
        if(localDate == null){
            return null;
        }
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获取当前月份
     * @return
     */
    public static int getNowMonth(){
        return LocalDate.now().getMonthValue();
    }

    /**
     * 获取当前日期
     * @return
     */
    public static int getNowDay(){
        return LocalDate.now().getDayOfMonth();
    }

    /**
     * 通过自定义参数，获取自定义日期格式
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static LocalDate changeToLocalDate(int year, int month, int day){
        return LocalDate.of(year, month, day);
    }

    /**
     * 判断两个日期是否相等
     * @param ld1
     * @param ld2
     * @return
     */
    public static boolean checkDayEquals(LocalDate ld1, LocalDate ld2){
        if(ld1 == null || ld2 == null){
            return false;
        }

        return ld1.equals(ld2);
    }

    /**
     * 将传入日期增加对应时间
     * @param localDateTime  传入对应时间
     * @param month  增加月份
     * @param day  增加天数
     * @param hours  增加小时
     * @param minutes  增加分钟
     * @return  增加后的时间
     */
    public static LocalDateTime addByHours(LocalDateTime localDateTime, int month,
                                           int day, int hours, int minutes){
        localDateTime.plusMonths(month);
        localDateTime.plusDays(day);
        localDateTime.plusHours(hours);
        localDateTime.plusMinutes(minutes);
        return localDateTime;
    }

    /**
     * 根据传入参数增加对应时间
     * @param localDateTime  传入时间
     * @param i  传入增加数值
     * @param unit  传入增加时间单位
     * @return 增加后的时间
     */
    public static LocalDateTime addByInput(LocalDateTime localDateTime, long i, ChronoUnit unit){
        localDateTime.plus(i, unit);
        return localDateTime;
    }

    /**
     * 获取时间格式为 yyyy-MM-dd
     * @param localDateTime
     * @return
     */
    public static String dateToStr(LocalDateTime localDateTime){
        if(localDateTime == null){
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return localDateTime.format(formatter);
    }

}
