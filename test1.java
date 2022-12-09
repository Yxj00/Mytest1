package com.duixiang.day09;

public class test1 {
    public static void main(String[] args) throws Exception {
        int count=0;
        for(int i=1;i<2021;i++){
            String n=String.valueOf(i);//将int型i转换成String字符串
            for(int j=0;j<n.length();j++){
                if(n.charAt(j)=='2'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
