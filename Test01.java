package com.duixiang.day05;

public class Test01 {
    /**
     * main �Ǽ�static���ε�
     * ���Կ���ֱ�ӵ��ñ���ľ�̬���� ��Ա����
     * @param args
     */
    private static int staticAge=22;
    private int age=22;
    public static void main(String[] args) {
        //main�������� ��̬��Ա���� ��̬����
        staticA();
        System.out.println(staticAge);//ֱ�ӷ���
        Test011.statA();//�����ľ�̬���� ����.���������ܵ���
        System.out.println(Test011.staAge);//������еľ�̬��Ա���� ��ֱ����.����������
        Test01 test011 = new Test01();
        System.out.println(test011.age);//��new��������ܵ���
        /**
         * �ھ�̬������ ���ܹ�ֱ�ӵ��÷Ǿ�̬���� ����new��������ܵ��÷Ǿ�̬����
         */
        Test01 test01 = new Test01();
        test01.a1();

    }
    public static void staticA(){

    }
    public  void a1(){

    }
}
