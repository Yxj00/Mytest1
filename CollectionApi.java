package com.collectionframe.march18th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApi {
    public static void main(String[] args) {
        // hashSet:添加的元素是无序，不重复，无索引
       Collection<String> list = new ArrayList<>();
       // 1.添加元素 添加成功返回true
        list.add("java");
        System.out.println(list.add("HTML"));
        list.add("java");
        System.out.println(list);
        //2. 清空集合的元素
//        list.clear();
//        System.out.println(list);
        // 3.判断集合的元素是否为空 是空返回true，反之
        System.out.println(list.isEmpty());
        //4.获取集合的大小
        System.out.println(list.size());
        // 5.判断集合中是否包含某个元素
        System.out.println(list.contains("java"));
        System.out.println(list.contains("黑马"));
        //6.删除某个元素：如果有多个重复的元素  默认删除前面的第一个
        System.out.println(list.remove("java"));
        System.out.println(list);
        // 7.把集合转换成数组
        Object[] arrs=list.toArray();
        System.out.println("数组"+Arrays.toString(arrs));
        System.out.println("------------拓展------------");
        Collection<String> c1=new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2=new ArrayList<>();
        c2.add("赵敏");
        c2.add("殷素素");
        // addAll把c2集合的元素全部倒入到c1中
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
