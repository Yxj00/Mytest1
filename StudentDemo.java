package com.duixiang.day02;

public class StudentDemo extends Student{
    public static void main(String[] args) {
        final int age =20;//final修饰局部变量
//        age=70;
        //使用final修饰局部变量 是基本数据类型 该局部变量不能被修改
      final  Student student= new Student();
//        student.age=60;不能被改
    }
}
