package com.maya;
import java.util.Scanner;
public class MyDemo3 {
    public static void main(String[] args) {
        //创建一个打印机
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        //接收用户在控制台中输入int类型
        int i= sc.nextInt();
        //System.out.println("您输入的数字是:"+i);
        System.out.println("请输入第二个数字:");
        int i1= sc.nextInt();
        System.out.println("两个数字的和:"+(i+i1));
    }
}
