package com.duixiang.day17;

public class TestTryC {
    public static void main(String[] args){
        System.out.println("��ʼ");
        try {
            //�����ܻᷢ���쳣�Ĵ����������
            a1();
        }catch (ArrayIndexOutOfBoundsException e){
           //����ɹ�
            System.out.println("�����ʵ�index �±�Խ����");
        }
        System.out.println("����");
    }
    public static void a1(){
        int[] arr1={1,2,4};
        System.out.println(arr1[3]);
    }
}
