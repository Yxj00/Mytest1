package com.collectionframe.march7th;

import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        /**
         * HashSetȥ���ظ�����ʱ
         * ������дequals������HashCode��������ʹ�䲻�����ظ���ֵ
         */
        students.add(new Student("Yxj01", "YXJ"));
        students.add(new Student("Yxj01", "YXJ"));
        students.add(new Student("Yxj01", "YXJ"));
        //hashSet����������ظ���ֵ
        System.out.println(students.size());
        for (Student s:students){
            System.out.println(s);
        }
    }
}
