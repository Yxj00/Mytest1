package com.duixiang.day01;

public class AnimalsDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2= new Cat();
        cat1.setName("Ð¡°×Ã¨");
        cat1.setAge(2);
        cat2.setName("Ð¡ºÚÃ¨");
        cat2.setAge(3);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setName("Ð¡°×¹·");
        dog1.setAge(2);
        dog2.setName("Ð¡ºÚ¹·");
        dog2.setAge(2);
        System.out.println(cat1.getName() + "--" + cat1.getAge() + "Ëê");
        cat1.catchMouse();
        System.out.println(cat2.getName() + "--" + cat2.getAge() + "Ëê");
        System.out.println(dog1.getName() + "--" + dog1.getAge() + "Ëê");
        System.out.println(dog2.getName() + "--" + dog2.getAge() + "Ëê");
    }
}
