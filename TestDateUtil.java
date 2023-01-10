package com.duixiang.day15;

import java.text.ParseException;
import java.util.Date;

/**
 * 日期工具类的设计
 */
public class TestDateUtil {
    public static void main(String[] args) throws ParseException {
        //将date类型转换成字符串类型
        String s = DateUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(s);
        //将string类型转换date类型
        Date date = DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        //String类型的s 要与后面的format格式要一致 否则会报错
        System.out.println(date);
        System.out.println(DateUtils.getDateString());
        
    }
}
