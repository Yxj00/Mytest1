package com.duixiang.day01;

public class AnimalsDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2= new Cat();
        cat1.setName("С��è");
        cat1.setAge(2);
        cat2.setName("С��è");
        cat2.setAge(3);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setName("С�׹�");
        dog1.setAge(2);
        dog2.setName("С�ڹ�");
        dog2.setAge(2);
        System.out.println(cat1.getName() + "--" + cat1.getAge() + "��");
        cat1.catchMouse();
        System.out.println(cat2.getName() + "--" + cat2.getAge() + "��");
        System.out.println(dog1.getName() + "--" + dog1.getAge() + "��");
        System.out.println(dog2.getName() + "--" + dog2.getAge() + "��");
    }
}
