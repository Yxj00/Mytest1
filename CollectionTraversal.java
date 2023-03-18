package com.collectionframe.march18th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversal {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("С��");
        list.add("С��");
        list.add("С��");
        list.add("С��");
        System.out.println(list);
        // 1.�õ���ǰ���ϵĵ���������
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
        // ��ݼ�list.for �س�
        for (String s : list) {
            //s.sout
            System.out.println(s);
        }
        System.out.println("----------------");
        list.forEach(System.out::println);
    }
}
