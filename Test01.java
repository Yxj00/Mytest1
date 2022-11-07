package com.duixiang.day05;

public class Test01 {
    /**
     * main 是加static修饰的
     * 所以可以直接调用本类的静态方法 成员变量
     * @param args
     */
    private static int staticAge=22;
    private int age=22;
    public static void main(String[] args) {
        //main方法调用 静态成员方法 静态属性
        staticA();
        System.out.println(staticAge);//直接访问
        Test011.statA();//别的类的静态方法 需类.方法名才能调用
        System.out.println(Test011.staAge);//别的类中的静态成员变量 可直接类.变量名调用
        Test01 test011 = new Test01();
        System.out.println(test011.age);//需new出对象才能调用
        /**
         * 在静态方法中 不能够直接调用非静态方法 必须new出对象才能调用非静态方法
         */
        Test01 test01 = new Test01();
        test01.a1();

    }
    public static void staticA(){

    }
    public  void a1(){

    }
}
