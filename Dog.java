package com.duixiang.day08;

public class Dog extends Animal {
    private String name;
    private int age;
    public Dog(){

    }

    public Dog(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("我是狗类 我喜欢肉肉");
    }

    @Override
    public void jump() {
        System.out.println("我是狗类 我可以跳的很高");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
