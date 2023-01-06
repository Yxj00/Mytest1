package com.duixiang.day11;

public class TextIndexof {
    public static void main(String[] args) {
        String str="Yxjxjxjxj";
        int x = str.indexOf("jx");//查找目标第一次出现的位置
        int i = str.indexOf('j', 1);//从指定位置开始查找
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
