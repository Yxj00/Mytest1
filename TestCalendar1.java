package com.duixiang.day16;

import java.util.Calendar;

/**
 * Calendar常用API方法
 */
public class TestCalendar1 {
    public static void main(String[] args) {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();//多态机制
        //修改获取系统时间
        c.add(Calendar.YEAR, 10);//年份修改 可+10 也可加负数-10等等
        c.add(Calendar.MONTH, -2);//月份修改
        c.add(Calendar.DATE, -3);//天数修改
        //set 可设置时间
        c.set(2222, 12, 15);
        int year = c.get(Calendar.YEAR);//获取年份
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+(month+1)+"月"+date+"日");


    }
}
