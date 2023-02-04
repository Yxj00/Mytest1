package com.duixiang.day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test01 {
    /**
     * 迭代器--属于集合中专用的
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("yxj");
        collection.add("Yxj01");
        collection.add("Yxj02");
        System.out.println("使用集合中专用迭代器遍历数据");
        Iterator<String> iterator = collection.iterator();//迭代器
//        System.out.println(iterator.next());//调用第一次next方法 取出第一个元素
//        System.out.println(iterator.next());//调用第二次next方法 取出第二个元素
//        System.out.println(iterator.next());//调用第三次next方法 取出第三个元素
        /**
         * next底层会使用计数器 每次调用next方法  计数+1
         */
//        for (int i = 0; i < collection.size(); i++) {
//            System.out.println(iterator.next());
//        }
//        System.out.println(iterator.hasNext());//判断元素值是否可以获取 如果可以获取 则返回true 否则返回false
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
