package com.duixiang.day03;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class StaticTest {
    private int age;
    private static int staticAge;

    /**
     * �Ǿ�̬�������Է��ʷǾ�̬��Ա���Ժ;�̬��Ա����
     */
    public void a1(){
        System.out.println(staticAge);
        a2();
    }

    /**
     * ������̬����
     * a2 static �ؼ�������
     * ��̬�������ܵ��÷Ǿ�̬�ķ����ͳ�Ա����
     *
     */
    public static void a2(){
        System.out.println(staticAge);
    }
    public static void staticA3(){
        System.out.println("����A3!!!");
    }
}


