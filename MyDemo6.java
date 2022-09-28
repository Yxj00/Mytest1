package com.maya;

public class MyDemo6 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        int count=0;
        for (int i=100;i<1000;i++){
            a=i/100;
            b=i%100/10;
            c=i%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println("水仙花数是:"+i);
                count++;
            }
        }
        System.out.println("水仙花的总数是:"+count);
    }
}
