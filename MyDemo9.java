package com.maya;
import  java.util.Random;
public class MyDemo9 {
    public static void main(String[] args) {
        Random ra=new Random();//创建对象
        int number= ra.nextInt(10);//随机数[0,10)
        System.out.println("java系统产生的随机数:"+number);
    }
}
