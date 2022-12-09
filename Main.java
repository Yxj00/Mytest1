package com.duixiang.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//        String s=scan.nextLine();

//        char s1=scan.next().charAt(0);
//        scan.close();
//        int count=0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)==s1){
//                count++;
//            }
//        }
//        System.out.println(count);
        int n=scan.nextInt();//表示考试人数
        int[] a=new int[n];
        int count1=0,count2=0;
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
            if(a[i]>=60){
                count1++;
            }
            if(a[i]>=85){
                count2++;
            }
        }
        int n1=(int)(count1*100.0/n+0.5);
        int n2=(int)(count2*100.0/n+0.5);
        System.out.println(n1+"%");
        System.out.println(n2+"%");

    }
}
