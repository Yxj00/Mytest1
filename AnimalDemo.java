package com.duixiang.day08;

public class AnimalDemo {
    public static void main(String[] args) {
        JumpInterface c1 = new Cat("С��è", 2);
        c1.jump();
        System.out.println("--------------");
        Animal c2 = new Cat("С��è",3);
         c2.jump();
         c2.eat();
        System.out.println(c2.getName()+"-"+c2.getAge());
        System.out.println("------------------");
        Animal dog1=new Dog("С�ڹ�", 3);
        System.out.println(dog1.getName()+" "+dog1.getAge());
        dog1.eat();
        dog1.jump();
    }
}
