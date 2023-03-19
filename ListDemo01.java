package com.collectionframe.march19th;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        //1.创建一个ArrayList集合对象
        //List：有序  可重复  有索引
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Mysql");
        list.add("Mysql");
        // 2.在某个索引位置插入元素
        list.add(2,"HTML");
        System.out.println(list);
        // 3.根据索引删除元素，返回被删除元素
        System.out.println(list.remove(2));
        System.out.println(list);

        // 4.根据索引获取元素
        System.out.println(list.get(2));
        // 5. 修改索引位置处的元素
        //返回修改前的数据
        System.out.println(list.set(1, "小黑"));//java
        System.out.println(list);
    }
}
