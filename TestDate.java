package com.duixiang.day15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String format = simpleDateFormat.format(date);
        System.out.println("��ʽ�����ʱ��:"+format);
        //�����Զ�������ڸ�ʽ  ����
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);
        //Diydiy  �Զ���6666
        SimpleDateFormat simpleDateFormat2= new SimpleDateFormat("�����Ǳ���ʱ��yyyy��MM��dd��HHСʱmm��ss��");
        String format2 = simpleDateFormat2.format(date);
        System.out.println(format2);

    }
}
