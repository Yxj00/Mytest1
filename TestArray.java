package com.duixiang.day13;

import java.util.Arrays;

/**
 * Aarrys�еķ���
 */
public class TestArray{
    public static void main(String[] args) {
        //1.����һ������
        int[] arr={23,13,78,98,45,87};
        System.out.println(arr);//������������ �ڴ��ַ
        //������ת�����ַ��� ʹ�� Arrays.toString()����
        String str = Arrays.toString(arr);
        System.out.println(str);
        //ð������
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");//����

        }

        System.out.println();
        char[] ch={'s','f','a','z'};
        Arrays.sort(ch);//char���� ��ĸ˳��
        System.out.println(Arrays.toString(ch));
    }
}
