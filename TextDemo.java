package com.duixiang.day07;

public class TextDemo {
    public static void main(String[] args) {
        Employee manager = new Manager("zs", 23, 20000.00,10000.00);
            manager.work();
        System.out.println("Ա��������"+manager.getName());
        System.out.println("Ա������:" + manager.getAge());
        System.out.println("Ա������:"+manager.getSalary());
        Manager manager1= (Manager)manager;//����ת�ͣ���ת��
        System.out.println("��Ŀ����Ľ���:"+manager1.getBonus());
        System.out.println("------------------------------------");
        HeadMan ls = new HeadMan("ls", 24, 20000.00);
        ls.work();
        System.out.println("�鳤����:" + ls.getName());
        System.out.println("�鳤����:" + ls.getAge());
        System.out.println("�鳤����:"+ls.getSalary());
    }
}
