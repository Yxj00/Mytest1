package com.duixiang.day15;

import java.text.ParseException;
import java.util.Date;

/**
 * ���ڹ���������
 */
public class TestDateUtil {
    public static void main(String[] args) throws ParseException {
        //��date����ת�����ַ�������
        String s = DateUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(s);
        //��string����ת��date����
        Date date = DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        //String���͵�s Ҫ������format��ʽҪһ�� ����ᱨ��
        System.out.println(date);
        System.out.println(DateUtils.getDateString());
        
    }
}
