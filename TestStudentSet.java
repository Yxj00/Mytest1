package com.collectionframe.march19th;

import java.util.HashSet;
import java.util.Set;

/**
 * Set hashSet
 * ȥ�ظ�
 * Ҫ��дhashCode��equals����
 */
public class TestStudentSet {
    public static void main(String[] args) {
       Set<Student> set = new HashSet<>();
        set.add(new Student("С��", 20));
        set.add(new Student("С��", 20));
        set.add(new Student("С��", 21));
        System.out.println(set);
    }
}
