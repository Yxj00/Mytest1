package com.duixiang.day11;

/**
 * String �滻����
 * ����replace,replaceFirst,replaceAll���÷�
 */
public class TextReplace {
    public static void main(String[] args) {
        String str="Yxj111";
        //replace ����1 ��Ҫ�滻���ַ�������111 ����2 �滻������� Yxj
        String newStr = str.replace("111", "Yxj");
        System.out.println("�滻ǰ������:"+str+"==>�滻�������:"+newStr);
        String str1="Yxj222Yxj222";
        //replaceFirst �滻�׸�ƥ����ַ���
        String newStr1 = str1.replaceFirst("222", "love");
        System.out.println("�滻ǰ������:"+str1+"==>�滻�������:"+newStr1);
        //replaceAll �滻�ַ���������ƥ����ַ���
        String newStr2 = str1.replaceAll("222", "==");
        System.out.println("�滻ǰ������:"+str1+"==>�滻�������:"+newStr2);
    }
}
