package com.duixiang;

public class Phone {
    /**
     * 类如何定义
     * public class 类的名称{}
     *
     * 手机类抽象的概念
     * 1.成员属性
     * 2.成员方法
     */
    String brand;//手机品牌
    double price;//手机价格

    /**
     * 拨打电话
     */
    public void call(){
        System.out.println("使用"+brand+"拨打电话");
    }
    public void sendMsg(){
        System.out.println("发送短信");
    }

}
