package com.duixiang.day05;

public class Dog extends AnimalParent{
    public int age=20;
    public int weigh=40;
    /**
     * 多态的基本的条件
     * 1.有继承或者实现的关系
     * 2.方法的重写---子类重写父类的方法
     * 3.有父类的引用
     */
    public void eat(){
        System.out.println("狗类重写了父类的吃方法");
    }
    public void show(){

    }
}
