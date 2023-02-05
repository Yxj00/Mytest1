package com.duixiang.day20;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class TestForEach {
    public static void main(String[] args) {
        //增强for循环 for each 遍历 数组和集合
        int[] ints = new int[]{60,30,52,82,44};
        for(int a:ints){
            System.out.println(a);
        }
        String[] str={"Yxj001","Yxj002","Yxj003"};
        for (String a:str){
            System.out.println(a);
        }
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Yxj004");
        strings.add("Yxj005");
        strings.add("Yxj006");

        for (String a:strings){
            System.out.println(a);
        }

    }
}
