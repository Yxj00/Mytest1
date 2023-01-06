package com.duixiang.day11;

/**
 * string 分割split()用法
 * 遇到 * | ^ 特殊字符要加\\
 */
public class TextSplit {
    public static void main(String[] args) {
        String str="南昌市|上饶市|天津市|北京市";
        String[] arr = str.split("\\|");
        String[] arr1 = str.split("\\|", 2);//分割份数
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        for (String a:arr){
            System.out.println(a);
        }
        for (String s:arr1){
            System.out.println(s);
        }
        for (int i=0;i< arr.length;i++){
            String s=arr[i];
            System.out.println(s);
        }
    }
}
