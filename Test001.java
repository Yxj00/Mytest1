package com.duixiang.day11;

import java.util.Scanner;

/**
 * дһ��ͳ���ַ�����Ĵ�Сд�����ָ���
 */
public class Test001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���:");
        String str=sc.nextLine();
        //����ͳ�ƴ�Сд���ֵı���
        int bigCount=0,smallCount=0,numberCount=0;
        //�����ַ���
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>='A'&&ch<='Z'){
                bigCount++;
            }else if (ch>='a'&&ch<='z'){
                smallCount++;
            }else if (ch>='0'&&ch<='9'){
                numberCount++;
            }
        }
        System.out.println("��д��ĸ�ĸ���Ϊ:"+bigCount);
        System.out.println("Сд��ĸ�ĸ���Ϊ:"+smallCount);
        System.out.println("���ֵĸ���Ϊ:"+numberCount);

    }
}
