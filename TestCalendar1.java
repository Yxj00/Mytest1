package com.duixiang.day16;

import java.util.Calendar;

/**
 * Calendar����API����
 */
public class TestCalendar1 {
    public static void main(String[] args) {
        //��ȡCalendar����
        Calendar c = Calendar.getInstance();//��̬����
        //�޸Ļ�ȡϵͳʱ��
        c.add(Calendar.YEAR, 10);//����޸� ��+10 Ҳ�ɼӸ���-10�ȵ�
        c.add(Calendar.MONTH, -2);//�·��޸�
        c.add(Calendar.DATE, -3);//�����޸�
        //set ������ʱ��
        c.set(2222, 12, 15);
        int year = c.get(Calendar.YEAR);//��ȡ���
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"��"+(month+1)+"��"+date+"��");


    }
}
