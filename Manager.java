package com.duixiang.day07;

public class Manager extends Employee {
    private double bonus;//�����н���

    @Override
    public void show() {

    }

    @Override
    public void work() {
        System.out.println("���Ǿ����Ҹ���������Ŀ");
    }

    public Manager(String name, int age, double salary,double bonus) {//���˽���
        super(name, age, salary);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
