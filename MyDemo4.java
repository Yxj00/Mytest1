package com.maya;
import java.util.Scanner;
public class MyDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入一个月份:");
        int month=sc.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("您输入的月份是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("您输入的月份是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("您输入的月份是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("您输入的月份是冬季");
                break;
            default:
                System.out.println("您输入的月份有误，请重新输入！");
                break;
        }
    }
}
