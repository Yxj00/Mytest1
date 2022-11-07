package com.duixiang.day05;

public class AnimalDemo {
    /**
     * 多态访问特点
     * 编译阶段
     * 成员属性 编译阶段看左边 执行也是看左边
     * 成员方法 编译阶段是看左边 执行看右边
     * @param args
     */
    public static void main(String[] args) {
        //本身的类型指向引用 new本身的对象
        Dog dog = new Dog();
        dog.eat();
        //有父类的引用指向我们的子类对象 多态
        AnimalParent animalParent=new Dog();
        animalParent.eat();
//        System.out.println(animalParent.wight);//报错原因是父类没有定义
        System.out.println(dog.weigh);
        System.out.println(dog.age);
        dog.show();

    }
}
