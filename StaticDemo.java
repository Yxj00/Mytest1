package com.duixiang.day03;

public class StaticDemo {
    public static void main(String[] args) {
        StaticTest s = new StaticTest();
        s.a1();
        StaticTest.staticA3();
        /**
         * 通过static被类中所有对象共享
         * 调用方法 类名.静态方法
         */
    }
}
