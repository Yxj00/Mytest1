package com.duixiang;

import java.sql.SQLOutput;

public class Student3 {
    private String name;
    private int age;

    public Student3(){
        //注意的是----this 这条语句必须写在第一行 否则会报错！！！！！！！！！
        this("玄机",22);//this可以调用到其他的构造函数
        System.out.println("这是一个无参函数");
    }

    public Student3(String name) {
        this.name = name;
    }

    public Student3(int age) {
        this.age = age;
    }

    public Student3(String name, int age) {
        System.out.println("学生姓名:"+name+"-年龄"+age);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
    public void a1(){
        System.out.println("a1方法");
        this.a2();//this 调用方法
    }
    public void a2(){
        System.out.println("a2方法");
        this.a3(10);//访问有参的方法
    }
    public static void a3(int a){
        System.out.println(a);
    }
}
