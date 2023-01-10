package com.duixiang.day15;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils { //���ڹ�����
    private static final String FORMAT_1="yyyy-MM-dd HH:mm:ss";//���峣��  ����ֱ�� �滻
    /**
     * 1,��date����ת�����ַ�������
     * 2�����ַ������� ����ת����date ����
     * ��ƹ�����  ���췽��˽�л��������Ʒ��ʼ���
     */
    private DateUtils() {
    }
    /**
     * ��ȡ��ǰϵͳʱ�� ֱ��ת����String����
     */
    public static String getDateString(){
        return dateToString(new Date(), FORMAT_1);
    }
    /**
     * ��date����ת�� �ַ�������
     * ��̬����
     * ���� date���� �͸�ʽ���ڵ�ģ��
     */
    public  static  String dateToString(Date date,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
    /**
     * ���ַ�������ת����date����
     */
    public static Date stringToDate(String date,String format) throws ParseException {//�ַ���������ʽ
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(date);//alt+enter
    }
}
