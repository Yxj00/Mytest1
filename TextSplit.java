package com.duixiang.day11;

/**
 * string �ָ�split()�÷�
 * ���� * | ^ �����ַ�Ҫ��\\
 */
public class TextSplit {
    public static void main(String[] args) {
        String str="�ϲ���|������|�����|������";
        String[] arr = str.split("\\|");
        String[] arr1 = str.split("\\|", 2);//�ָ����
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
