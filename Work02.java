package com.duixiang.day18;

import java.util.ArrayList;

public class Work02 {
    public static void main(String[] args) {
        //1.����4��ѧ������
        Student st1 = new Student("YXj001", 20);
        Student st2 = new Student("YXj001", 20);
        Student st3 = new Student("YXj001", 20);
        Student st4 = new Student("YXj001", 20);
        //2.ѧ������
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        //3.����
        for (int  i=0;i<students.size();i++){

            System.out.println(students.get(i));
        }
    }
}
