package com.duixiang.day11;

import java.util.Scanner;

/**
 * 写一个统计字符串里的大小写和数字个数
 */
public class Test001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.nextLine();
        //定义统计大小写数字的变量
        int bigCount=0,smallCount=0,numberCount=0;
        //遍历字符串
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
        System.out.println("大写字母的个数为:"+bigCount);
        System.out.println("小写字母的个数为:"+smallCount);
        System.out.println("数字的个数为:"+numberCount);

    }
}
