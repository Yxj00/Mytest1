package com.duixiang.day14;

/**
 * װ��:�Զ���������������ת���ɰ�װ����  ������������-->��װ����
 * ����:�Զ�����װ����ת���ɻ�����������   ��װ���� -->������������
 */
public class Test014 {
    public static void main(String[] args) {
        Integer a=88;//װ��
        /**
         * ����ײ� a����װ����
         * int z=a;���ߵ�Integer.intValue()����
         */
        int z=a;//����
        Integer b=0;
        b+=1;
        /**
         * b(Integer.intValue()+1,b+1==�Զ�����=0+1)
         * b+1�Ľ����ֵ��b=0+1 b(��װ����)  1�ǻ�����������  Integer b=Integer.valueOf(0+1)�Զ�װ��Ĺ���
         */
        if (b instanceof Integer){
            System.out.println("����Integer���ͣ�");
        }
    }
}
