package com.duixiang.day07;

public class Manager extends Employee {
    private double bonus;//经理有奖金

    @Override
    public void show() {

    }

    @Override
    public void work() {
        System.out.println("我是经理，我负责整个项目");
    }

    public Manager(String name, int age, double salary,double bonus) {//加了奖金
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
