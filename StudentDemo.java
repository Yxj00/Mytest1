package com.duixiang;

public class StudentDemo {
    public static void main(String[] args) {
        //1.new 类的名称
      Student student1=new Student();//存放 new student（）堆空间
        System.out.println(student1);//输出对象的内存地址
      student1.name="玄机";
      student1.age=21;
      System.out.println(student1.name+"--"+student1.age);
      student1.study();
    }
}
