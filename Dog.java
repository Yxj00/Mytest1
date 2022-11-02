package com.duixiang.day01;

public class Dog extends Animals{
    public Dog(String name,int age){
        super(name,age);
    }

    public Dog() {
    }
    public void lookDoor(){
        System.out.println("我是修狗 会看家护院");
    }
}
