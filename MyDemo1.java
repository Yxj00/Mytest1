package com.maya;

public class MyDemo1 {
    public static void main(String[] args) {
        int a=10;
        char b='a';//底层数值类型值=97
        System.out.println(a+b);
        System.out.println(a+10+"YXJ");//20YXJ
        System.out.println("YXJ"+a+10);//字符串在前加号是连接符，否则是算术运算符YXJ1010
        System.out.println("YXJ"+(a+10));//YXJ20
        int y=a++ + a++ +a++;
        System.out.println(y);
        System.out.println(y>a);
        /**
         &逻辑与 并且 全1得1
         |逻辑或  见1得1 全0得0
         ^逻辑异或 同0异1
         !逻辑非 取反
         &&短路与，作用于&相同，但是有短路效果
         ||短路或 ，作用与|相同，但是有短路效果
         */
    }
}
