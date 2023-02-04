package com.duixiang.day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Test02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yxj001");
        list.add("Yxj002");

        /**
         * Iterator 从头到尾部遍历
         * list集合中独有的ListIterator迭代器 从头到尾 或者从尾到头部遍历
         */
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("从头到尾");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("从尾到头");
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());

    }
}
