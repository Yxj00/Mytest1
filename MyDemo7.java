package com.maya;

public class MyDemo7 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        int i=100;
        int count=0;
        while (i<=999){
            a=i/100;
            b=i/10%10;
            c=i%10;
            if ((a*a*a+b*b*b+c*c*c)==i){
                System.out.println("水仙花数为:"+i);
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
