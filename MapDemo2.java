package com.collectionframe.march20thMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> maps=new HashMap<>();
        maps.put("鸿星尔克",3);
        maps.put("Java",1);
        maps.put("生活用品",1000);
        maps.put("枸杞",100);
        maps.put("手表",10);
        System.out.println(maps);

        // 通过调用Map的方法 entrySet把Map集合转换成Set集合形式
        // 1.把Map集合转换成Set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        // 2.开始遍历
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"-====>"+value);
        }
        System.out.println("--------与上面相等--------");
        maps.forEach((k,v)-> System.out.println(k+"===>"+v));
    }
}
