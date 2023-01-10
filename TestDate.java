package com.duixiang.day15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String format = simpleDateFormat.format(date);
        System.out.println("格式化后的时间:"+format);
        //可以自定义的日期格式  如下
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);
        //Diydiy  自定义6666
        SimpleDateFormat simpleDateFormat2= new SimpleDateFormat("现在是北京时间yyyy年MM月dd日HH小时mm分ss秒");
        String format2 = simpleDateFormat2.format(date);
        System.out.println(format2);

    }
}
