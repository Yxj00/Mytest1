package com.duixiang.day11;

public class TextIndexof {
    public static void main(String[] args) {
        String str="Yxjxjxjxj";
        int x = str.indexOf("jx");//����Ŀ���һ�γ��ֵ�λ��
        int i = str.indexOf('j', 1);//��ָ��λ�ÿ�ʼ����
        System.out.println(x);
        System.out.println(i);
        for (int j=0;j<str.length();j++){
            char ch=str.charAt(j);
            if (ch=='x'){
                System.out.println(j);
            }
        }
    }
}
