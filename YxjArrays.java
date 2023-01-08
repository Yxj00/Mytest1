package com.duixiang.day13;

import java.util.Arrays;

/**
 * 工具类设计思想
 * 1.构造方法使用 Private
 * 2.public static 关键字修饰 工具类中方法 可以直接通过类名称方法
 * 写一个从大到小的排序方法
 */
public final class YxjArrays {//final 无法被继承
    private YxjArrays() {
    }
    public static void sort(int[] arr){
        Arrays.sort(arr);
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static String toString(int[] arr){
        if (arr==null){
            return "null";
        }
        int iMax = arr.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder a = new StringBuilder();//构造一个字符串构造器
        a.append('[');//追加
        for (int i=arr.length-1; ;i--){
            a.append(arr[i]);
            if (i==0)return a.append(']').toString();
            a.append(',');
        }


    }
}
