package com.duixiang.day11;

/**
 * String 替换方法
 * 讲解replace,replaceFirst,replaceAll的用法
 */
public class TextReplace {
    public static void main(String[] args) {
        String str="Yxj111";
        //replace 参数1 需要替换的字符串内容111 参数2 替换后的内容 Yxj
        String newStr = str.replace("111", "Yxj");
        System.out.println("替换前的内容:"+str+"==>替换后的内容:"+newStr);
        String str1="Yxj222Yxj222";
        //replaceFirst 替换首个匹配的字符串
        String newStr1 = str1.replaceFirst("222", "love");
        System.out.println("替换前的内容:"+str1+"==>替换后的内容:"+newStr1);
        //replaceAll 替换字符串中所有匹配的字符串
        String newStr2 = str1.replaceAll("222", "==");
        System.out.println("替换前的内容:"+str1+"==>替换后的内容:"+newStr2);
    }
}
