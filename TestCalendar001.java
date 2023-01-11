package com.duixiang.day16;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 获取任意一年的二月有多少天
 */
public class TestCalendar001 {
    public static void main(String[] args) {
        System.out.println("请输入年份:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();//获取Calendar对象
        c.set(year,2 , 1);//Month初始是从0开始的 也就是说Month=0相当于1月份  2就相当于3月份
        c.add(Calendar.DATE, -1);
        System.out.println(year+"年  "+(c.get(Calendar.MONTH)+1)+"月是有"+c.get(Calendar.DATE)+"天");
        System.out.println(year+"年是"+(c.get(Calendar.DATE)==29?"润年":"平年"));
    }
}
