package com.duixiang.day10;

public class Test01 {
    public static void main(String[] args) {
        String a="yxj";
        String b="yxj";
        System.out.println(a.equals(b));
        System.out.println(a==b);
        Student s1 = new Student("Yxj", 23);
        Student s2 = new Student("Yxj", 23);
        System.out.println(s1.equals(s2));//要重写object类中的equals函数
        System.out.println(s1==s2);//地址不一样
    }
}
