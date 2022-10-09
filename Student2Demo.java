package com.duixiang;

public class Student2Demo {
    public static void main(String[] args) {
        //new 执行到 构造方法 构造方法中做一些初始化操作
     Student2 s2= new Student2();
     Student2 st2=new Student2("玄机");//有参构造方法
     s2.setName("余玄机");
     s2.setAge(22);
     String show=s2.show();
        System.out.println(show);
    }
}
