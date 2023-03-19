package com.collectionframe.march19th;

import java.util.HashSet;
import java.util.Set;

/**
 * Set hashSet
 * 去重复
 * 要重写hashCode和equals方法
 */
public class TestStudentSet {
    public static void main(String[] args) {
       Set<Student> set = new HashSet<>();
        set.add(new Student("小黑", 20));
        set.add(new Student("小黑", 20));
        set.add(new Student("小白", 21));
        System.out.println(set);
    }
}
