package com.duixiang.day01;

public class Animals {
    private String name;//�������������
    private int age;//��������
    //����һ���޲η���
    public Animals(){

    }
    //������������вι��췽��
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
