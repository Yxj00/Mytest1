package com.duixiang.day07;

public class TextDemo {
    public static void main(String[] args) {
        Employee manager = new Manager("zs", 23, 20000.00,10000.00);
            manager.work();
        System.out.println("员工姓名："+manager.getName());
        System.out.println("员工年龄:" + manager.getAge());
        System.out.println("员工工资:"+manager.getSalary());
        Manager manager1= (Manager)manager;//向下转型，父转子
        System.out.println("项目经理的奖励:"+manager1.getBonus());
        System.out.println("------------------------------------");
        HeadMan ls = new HeadMan("ls", 24, 20000.00);
        ls.work();
        System.out.println("组长姓名:" + ls.getName());
        System.out.println("组长年龄:" + ls.getAge());
        System.out.println("组长工资:"+ls.getSalary());
    }
}
