package com.collectionframe.march18th;

public class LambdaDemo01 {
    public static void main(String[] args) {
        /**
         * Ŀ�꣺ѧ��ʹ��lambda�ı�׼��ʽ�������ڲ���Ĵ�����ʽ
         * lambdaֻ�ܼ򻯽ӿ���ֻ��һ�����󷽷��������ڲ�����ʽ
         */
//        Swimming s1=new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("����Ӿ����");
//            }
//        };
        // ��
        Swimming s1=()->{
            System.out.println("����Ӿ����");
        };
        go(s1);
        System.out.println("---------------���ż�----------------");
//        go(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("ȥ��Ӿ�ÿ���");
//            }
//        });
        // ���ż�
        go(()-> System.out.println("ȥ��Ӿ�ÿ���"));
    }
    public static void go(Swimming s){
        System.out.println("��ʼ");
        s.swim();
        System.out.println("����");

    }
}
@FunctionalInterface//һ���������ע������Ǻ���ʽ�ӿڣ�����ֻ����һ�����󷽷�
interface  Swimming{
    void swim();
}
