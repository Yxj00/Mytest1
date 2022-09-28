package com.maya;

public class MyDemo8 {
    public static void main(String[] args) {
        double paper=0.1;
        int count=0;
        while (paper<8844430){
            paper=paper*2;
            count++;
        }
        System.out.println("需要折叠"+count+"次");
    }
}
