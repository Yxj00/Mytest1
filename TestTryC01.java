package com.duixiang.day17;

public class TestTryC01 {
    public static void main(String[] args){
        System.out.println("��ʼ");
        try {
            //�����ܻᷢ���쳣�Ĵ����������
            a1();
        }catch (ArrayIndexOutOfBoundsException e){
            //���������±��쳣
            //����ɹ�
            System.out.println("�����ʵ�index �±�Խ����");
            e.printStackTrace();
        }catch (NumberFormatException e){
            //��������ת���쳣
            System.out.println("���� ת���쳣");
            System.out.println( e.getMessage());//�쳣������Ϣ����
        }
        System.out.println("����");
    }

    /**
     * ���򱨴��� ����catch�������ƥ���쳣����
     * ����ɹ�  ��������ִ��
     * û�в���  �����ж�
     */
    public static void a1(){
        int[] arr1={1,2,4};
        System.out.println(arr1[1]);
        String str="m123";
        int str1 = Integer.parseInt(str);

    }
}