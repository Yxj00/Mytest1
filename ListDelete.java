package com.collectionframe.march19th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDelete {
    public static void main(String[] args) {
        // 1.准备测试数据
        List<String> list=new ArrayList<>();
        list.add("小黑");
        list.add("Java");
        list.add("Java");
        list.add("小白");

        /**
         * 需求：删除全部的Java信息
         * a.迭代器遍历删除
         */
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ele = it.next();
            if ("Java".equals(ele)){
//                list.remove(ele);会后移报错
                it.remove();// 使用迭代器 删除当前所在元素，并且不会后移
            }
        }
        System.out.println(list);

        // b.使用foreach遍历删除 增强for  有bug
//        for (String s : list) {
//            if ("Java".equals(s)){
//                list.remove("Java");
//            }
//        }

    }
}
