package com.duixiang.day06;

import java.util.Random;

public class Test001 {
    public static int[] zyb() {
        int[] arr=new int[7];
        Random r=new Random();
        for(int i=0;i< 6;) {
            int rednumber=r.nextInt(33)+1;
            boolean flag=contrain(arr,rednumber);
            if(!flag) {
                arr[i]=rednumber;
                i++;
            }
            int bluenumber=r.nextInt(16)+1;
            arr[arr.length-1]=bluenumber;



        }
        return arr;
    }
    public static boolean contrain(int[] arr,int number) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==number)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr=zyb();
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
