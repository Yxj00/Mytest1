package com.collectionframe.march17th;



import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AboutList01 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","c");
        // 集合类支持增强for循环，但是只是语法糖
        for (String s:list){
            System.out.println(s);
        }
        // 迭代器实现
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        //java8，foreach方法
        list.forEach(s-> System.out.println(s));
        // 方法引用 lambda
        list.forEach(System.out::println);
    }
}
