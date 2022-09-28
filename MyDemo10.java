package com.maya;
//猜数字游戏
import java.util.Scanner;
import java.util.Random;
public class MyDemo10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入:");
        int i = s.nextInt();
        Random r = new Random();
        int j = r.nextInt(100);
        while (i!=0) {
            if (i < j) {
                System.out.println("您输入的数比随机数小！请重新输入");
            } else if (i==j) {
                System.out.println("恭喜你猜对了！");
                break;
            }
            else if (i>j){
                System.out.println("您输入的数比随机数大！请重新输入！");
            }
            i=s.nextInt();
        }
    }
}