package com.duixiang.day18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 优化Work02代码
 */
public class Work002 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        //1.输入5个学生对象
        for (int i = 1; i <=3 ; i++) {
            Scanner sc = new Scanner(System.in);//这个写在for循环里面  不要写在外面
            System.out.println("第"+i+"个学生姓名");
            String usrName= sc.nextLine();
            System.out.println("第"+i+"个学生年龄");
            int age = sc.nextInt();
            students.add(new Student(usrName,age));//存入集合
            System.out.println("--------------");
        }
        System.out.println("录入成功，开始查询学生信息！");
        //2.遍历并输出
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("姓名:"+student.getUsername()+" 年龄:"+student.getAge());

        }
    }
}
