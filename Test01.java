package com.duixiang.day14;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        String arr="97,16,36,18,50";
        String[] str=arr.split(",");
        int[] intA=new int[5];
        for (int j=0;j<str.length;j++){
            int i = Integer.parseInt(str[j]);
            intA[j]=i;
        }
        Arrays.sort(intA);
        System.out.println(Arrays.toString(intA));
    }
}
