package com.maya;
//找出三人中身高最高的
//用三目运算符
public class MyDemo2 {
    public static void main(String[] args) {
        int height1=160;
        int height2=170;
        int height3=180;
        int temp_height=height1>height2?height1:height2;
        int max_height=temp_height>height3?temp_height:height3;
        System.out.println("max_height:"+max_height);
    }
}
