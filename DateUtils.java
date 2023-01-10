package com.duixiang.day15;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils { //日期工具类
    private static final String FORMAT_1="yyyy-MM-dd HH:mm:ss";//定义常量  下面直接 替换
    /**
     * 1,将date类型转换成字符串类型
     * 2，将字符串类型 日期转换成date 类型
     * 设计工具类  构造方法私有化，类名称访问即可
     */
    private DateUtils() {
    }
    /**
     * 获取当前系统时间 直接转化成String类型
     */
    public static String getDateString(){
        return dateToString(new Date(), FORMAT_1);
    }
    /**
     * 将date类型转化 字符串类型
     * 静态方法
     * 传递 date类型 和格式日期的模板
     */
    public  static  String dateToString(Date date,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
    /**
     * 将字符串类型转换成date类型
     */
    public static Date stringToDate(String date,String format) throws ParseException {//字符串日期形式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(date);//alt+enter
    }
}
