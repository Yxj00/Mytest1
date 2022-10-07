package com.duixiang;

public class PhoneDemo {
    public static void main(String[] args) {
        //1.手机测试类
        //1.先创建 对象 类名称 对象名称=new 类名称（）
        Phone phone1=new Phone();//phone1 对象名称
        //phone1 局部变量 对象名称.(成员属性和成员方法)
        phone1.brand="华为";
        phone1.price=2999;
        System.out.println(phone1.brand);
        System.out.println(phone1.price);
        phone1.call();
        Phone phone2=new Phone();
        phone2.brand="小米";
        phone2.price=1999;
        phone2.call();
    }
}
