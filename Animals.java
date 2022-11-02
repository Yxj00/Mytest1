package com.duixiang.day01;

public class Animals {
    private String name;//创建动物的姓名
    private int age;//动物年龄
    //构造一个无参方法
    public Animals(){

    }
    //创建动物类的有参构造方法
    public Animals(String name, int age) {
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
