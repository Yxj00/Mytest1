package com.duixiang.day13;

/**
 * ����System�еķ���  exit��currentTimeMillis
 */
public class TestSystem {
    public static void main(String[] args) {
//        System.exit(0);//�����˳���0  ��0Ϊ�쳣�˳�
        long start = System.currentTimeMillis();//��ȡ��ǰʱ�䣨��1970��1��1�գ� ���� 1s=1000ms
        System.out.println(start);
        for (int i = 0; i < 10000; i++) {
            System.out.println("Yxj");
        }
        long end = System.currentTimeMillis();
        System.out.println("ѭ��10000����"+(end-start)+"����");
    }
}
