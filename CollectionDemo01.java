package com.collectionframe.march18th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 明确collection集合体系的特点
 * 集合和泛型不支持基本数据类型，只能支持引用数据类型
 */
public class CollectionDemo01{
    public static void main(String[] args) {
        // 有序  可重复 有索引
        Collection list =new ArrayList();
        list.add("java");
        list.add("java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);
        // 无序 不重复 无索引
        Collection list1 =new HashSet();
        list1.add("java");
        list1.add("java");
        list1.add("Mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);
    }
}
