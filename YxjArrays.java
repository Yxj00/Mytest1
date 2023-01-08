package com.duixiang.day13;

import java.util.Arrays;

/**
 * ���������˼��
 * 1.���췽��ʹ�� Private
 * 2.public static �ؼ������� �������з��� ����ֱ��ͨ�������Ʒ���
 * дһ���Ӵ�С�����򷽷�
 */
public final class YxjArrays {//final �޷����̳�
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
        StringBuilder a = new StringBuilder();//����һ���ַ���������
        a.append('[');//׷��
        for (int i=arr.length-1; ;i--){
            a.append(arr[i]);
            if (i==0)return a.append(']').toString();
            a.append(',');
        }


    }
}
