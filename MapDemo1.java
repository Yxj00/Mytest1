package com.collectionframe.march20thMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 目标:认识Map体系的特点：按照键无序 不重复 无索引 值不做要求
 */
public class MapDemo1 {
    public static void main(String[] args) {
        // 创建一个map集合对象
        Map<String,Integer> maps=new HashMap<>();
        maps.put("鸿星尔克",3);
        maps.put("Java",1);
        maps.put("Java",1);// 覆盖前面的数据
        maps.put("枸杞",100);
        maps.put(null,null);
        System.out.println(maps);
        System.out.println("--------------------");
        Map<String,Integer> maps1=new LinkedHashMap<>();// 有序 不重复 无索引
        maps1.put("鸿星尔克",3);
        maps1.put("Java",1);
        maps1.put("Java",1);// 覆盖前面的数据
        maps1.put("枸杞",100);
        maps1.put(null,null);
        System.out.println(maps1);
    }
}
