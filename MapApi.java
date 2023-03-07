package com.collectionframe.march7th;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapApi {
    public static void main(String[] args) {
        Map<String,String> hashMap=new HashMap<>();
        Map<Integer,String> hashMap1=new HashMap<>();
        Map<Integer,Integer> hashMap2=new HashMap<>();
        /**
         * 根据键获取值
         */
        hashMap.put("Yxj01", "YXJ");
        hashMap1.put(1, "YXJ01");
        hashMap2.put(1, 1);
        System.out.println(hashMap.get("Yxj01"));
        System.out.println(hashMap.get("Yxj"));// null
        System.out.println(hashMap1.get(1));
        System.out.println(hashMap1.get(2));// null
        System.out.println(hashMap2.get(1));
        System.out.println(hashMap2.get(2));// 还是null
        /**
         * 获取所有键的集合
         */
        System.out.println("获取所有键的集合(返回Set集合)");
        Set<String> s=hashMap.keySet();
        for (String str:s){
            System.out.println(str);
        }
        System.out.println("获取所有键的集合(返回Collection集合)");
        Collection<String> values = hashMap.values();
        for (String str:values){
            System.out.println(str);
        }
        // 获取所有键值对象的集合
        System.out.println("获取所有键值对象的集合");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        // HashMap集合底层键值对如何封装  就是通过Map接口中的entry对象
        for (Map.Entry<String, String> str:entries){
            System.out.println(str);
        }
        // 如果存在相应的key则返回其对应的value,否则返回给定的默认值defaultValue
        String yxj01 = hashMap.getOrDefault("Yxj01", "没有找到");
        System.out.println(yxj01);
    }
}
