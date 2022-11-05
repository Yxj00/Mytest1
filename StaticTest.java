package com.duixiang.day03;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class StaticTest {
    private int age;
    private static int staticAge;

    /**
     * 非静态方法可以访问非静态成员属性和静态成员属性
     */
    public void a1(){
        System.out.println(staticAge);
        a2();
    }

    /**
     * 创建静态方法
     * a2 static 关键字修饰
     * 静态方法不能调用非静态的方法和成员变量
     *
     */
    public static void a2(){
        System.out.println(staticAge);
    }
    public static void staticA3(){
        System.out.println("我是A3!!!");
    }
}


