package com.duixiang.day01;

public class Cat extends Animals{
//要创建一个猫类的构造方法
    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat(){

    }
    public void catchMouse(){
        System.out.println("我是猫 会抓老鼠欧");
    }
}
