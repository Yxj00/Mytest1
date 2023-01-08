package com.duixiang.day13;

import java.util.Arrays;

/**
 * Aarrys中的方法
 */
public class TestArray{
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr={23,13,78,98,45,87};
        System.out.println(arr);//输出的是数组的 内存地址
        //将数组转换成字符串 使用 Arrays.toString()方法
        String str = Arrays.toString(arr);
        System.out.println(str);
        //冒泡排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");//倒序

        }

        System.out.println();
        char[] ch={'s','f','a','z'};
        Arrays.sort(ch);//char类型 字母顺序
        System.out.println(Arrays.toString(ch));
    }
}
