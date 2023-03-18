package com.collectionframe.march18th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversal {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("小黑");
        list.add("小白");
        list.add("小黄");
        list.add("小粉");
        System.out.println(list);
        // 1.得到当前集合的迭代器对象
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
        // 快捷键list.for 回车
        for (String s : list) {
            //s.sout
            System.out.println(s);
        }
        System.out.println("----------------");
        list.forEach(System.out::println);
    }
}
