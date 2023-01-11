package com.duixiang.day16;

import java.util.Calendar;

/**
 * Calendar日历类
 *
 */
public class TestCalendar {
    public static void main(String[] args) {
//        Calendar calendar = new Calendar();
// Calendar类是抽象类 不能被new出来  这样写会报错 可以new出它的子类
//        int i = calendar.get(Calendar.YEAR);
        //获取Calendar对象
        Calendar c = Calendar.getInstance();//多态机制
//        System.out.println(c);
        //获取年月日
        int year = c.get(Calendar.YEAR);
//        System.out.println(year);
        int month = c.get(Calendar.MONTH);//获取月份 从0开始 需加1
//        System.out.println(month+1);
        int date = c.get(Calendar.DATE);//获取日
        System.out.println(year+"年"+(month+1)+"月"+date+"日");
    }
}
