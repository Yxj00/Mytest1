package com.duixiang.day12;

/**
 * math��
 * 1,Math����û��ϵͳ�������ʹ��캯��
 * 2��Math�� �޲ι��캯��ֱ����˽�е� �޷� new Math��
 * 3��Math ʹ��api���ʶ��Ǽ���static ʹ�ø÷��� ֱ��ͨ��������.��������
 *
 */
public class TestMath {
    public static void main(String[] args) {
        System.out.println("----Math.abs() ���ؾ���ֵ----");
        System.out.println(Math.abs(-11));
        System.out.println(Math.abs(-12.23));
        System.out.println("----Math.ceil() ���ش��ڻ���ڲ���-----");
        //ceil()  ���Ϊ����ȡ��  double���͵�����  С�����ֱ�Ϊ0
        System.out.println(Math.ceil(99.23));
        System.out.println(Math.ceil(99.99));
        System.out.println(Math.ceil(88.00));
        System.out.println(Math.ceil(-0.99));
        System.out.println(Math.ceil(99));
        System.out.println(Math.ceil(0));
        System.out.println("----Math.floor()����С�ڻ���ڲ���----");
        //floor()  �����Ϊ����ȡ��  double���͵����� С�����ֱ�Ϊ0
        System.out.println(Math.floor(99.23));
        System.out.println(Math.floor(99.99));
        System.out.println(Math.floor(-0.99));
        System.out.println(Math.floor(99));
        System.out.println(Math.floor(0));
        System.out.println("----�������� round����----");
        System.out.println(Math.round(12.23));
        System.out.println(Math.round(12.53));//double   ������ӽ���long����
        System.out.println(Math.round(12.4));
        System.out.println(Math.round(12.5));//float���� ������ӽ���int����
        System.out.println("----Math.pow() ����a��b����----");
        System.out.println(Math.pow(2, 3));//����double����  2^3
        System.out.println("----Math.random() ����0-1.0������� ����1.0");
        System.out.println(Math.random());
        System.out.println((int) (Math.random()*100));
    }
}
