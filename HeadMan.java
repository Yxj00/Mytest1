package com.duixiang.day07;

public class HeadMan extends Employee {
    @Override
    public void show() {

    }

    @Override
    public void work() {
        System.out.println("�����鳤 �Ҹ�����빤��");
    }

    public HeadMan(String name, int age, double salary) {
        super(name, age, salary);
    }
}
