package com.duixiang.day16;

import java.util.Calendar;

/**
 * Calendar������
 *
 */
public class TestCalendar {
    public static void main(String[] args) {
//        Calendar calendar = new Calendar();
// Calendar���ǳ����� ���ܱ�new����  ����д�ᱨ�� ����new����������
//        int i = calendar.get(Calendar.YEAR);
        //��ȡCalendar����
        Calendar c = Calendar.getInstance();//��̬����
//        System.out.println(c);
        //��ȡ������
        int year = c.get(Calendar.YEAR);
//        System.out.println(year);
        int month = c.get(Calendar.MONTH);//��ȡ�·� ��0��ʼ ���1
//        System.out.println(month+1);
        int date = c.get(Calendar.DATE);//��ȡ��
        System.out.println(year+"��"+(month+1)+"��"+date+"��");
    }
}
