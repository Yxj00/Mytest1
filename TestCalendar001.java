package com.duixiang.day16;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ��ȡ����һ��Ķ����ж�����
 */
public class TestCalendar001 {
    public static void main(String[] args) {
        System.out.println("���������:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();//��ȡCalendar����
        c.set(year,2 , 1);//Month��ʼ�Ǵ�0��ʼ�� Ҳ����˵Month=0�൱��1�·�  2���൱��3�·�
        c.add(Calendar.DATE, -1);
        System.out.println(year+"��  "+(c.get(Calendar.MONTH)+1)+"������"+c.get(Calendar.DATE)+"��");
        System.out.println(year+"����"+(c.get(Calendar.DATE)==29?"����":"ƽ��"));
    }
}
