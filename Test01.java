package com.collectionframe.march7th;

import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        /**
         * HashSet去除重复数据时
         * 必须重写equals方法和HashCode方法才能使其不插入重复的值
         */
        students.add(new Student("Yxj01", "YXJ"));
        students.add(new Student("Yxj01", "YXJ"));
        students.add(new Student("Yxj01", "YXJ"));
        //hashSet不允许存入重复的值
        System.out.println(students.size());
        for (Student s:students){
            System.out.println(s);
        }
    }
}
