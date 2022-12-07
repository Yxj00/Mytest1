package com.duixiang.day08;

public abstract class Animal implements JumpInterface {
    private String name;
    private int age ;
    public Animal(){//定义一个无参构造方法

    }
    /**
     * 在我们Animal动物类中 已经有一个jump（）跳高抽象
     * 定义一个抽象方法
     */
    public abstract void eat();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
