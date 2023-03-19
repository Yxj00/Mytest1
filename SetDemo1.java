package com.collectionframe.march19th;

import java.util.Set;
import java.util.TreeSet;

/**
 * 观察TreeSet对于有值特性的数据如何排序
 * 学会对自定义类型 的对象进行指定规则排序
 *
 * 对于Integer，Double  官方默认按照大小进行升序排序
 * 对于字符串类型：默认按照首字符的编号升序排序
 * 对于自定义类型如Student对象  TreeSet无法直接排序
 */
public class SetDemo1 {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();// 不重复 无索引可排序
        sets.add(23);
        sets.add(2);
        sets.add(3);
        sets.add(32);
        sets.add(99);
        System.out.println(sets);

        Set<String> sets1 = new TreeSet<>();
        sets1.add("小黑");
        sets1.add("小白");
        sets1.add("小黄");
        sets1.add("小花");
        sets1.add("小小");
        System.out.println(sets1);
    }
}
