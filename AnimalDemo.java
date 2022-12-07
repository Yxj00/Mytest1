package com.duixiang.day08;

public class AnimalDemo {
    public static void main(String[] args) {
        JumpInterface c1 = new Cat("小黑猫", 2);
        c1.jump();
        System.out.println("--------------");
        Animal c2 = new Cat("小花猫",3);
         c2.jump();
         c2.eat();
        System.out.println(c2.getName()+"-"+c2.getAge());
        System.out.println("------------------");
        Animal dog1=new Dog("小黑狗", 3);
        System.out.println(dog1.getName()+" "+dog1.getAge());
        dog1.eat();
        dog1.jump();
    }
}
