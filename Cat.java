package com.duixiang.day08;

public class Cat extends Animal{
    public Cat(String name,int age){

        super(name,age);
    }
    public void jump(){
        System.out.println("我是猫类 我可以跳高了！");
    }
    public void eat(){
        System.out.println("我是猫类  我喜欢吃鱼 喵喵喵");
    }
}
