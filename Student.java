package com.duixiang.day10;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        //如果两个对象的内存地址相同直接返回true
        if (this==obj){
            return true;
        }
       //比较两个对象的类型是否一致 对象名.getclass()
        if (obj==null||this.getClass()!=obj.getClass()){//两个对象类型不一致 则返回true
            return false;
        }
        //两个对象的类型是一致的 则比较两个对象的成员属性值
        //string类型中equals方法比较 两个字符串的值相等   String底层重写了object父类
        return this.age==((Student) obj).age&&this.name.equals(((Student) obj).name);
    }
}
