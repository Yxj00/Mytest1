package com.collectionframe.March4th;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合特点:
 * 1、映射键值对的形式 key和value 简称 K v
 * 2. Map集合中 key 是不允许重复的，但是value可以
 * 如果key存在  直接修改value值
 * 3. Map集合是散列存放数据 所以会存在散列的问题遍历数据和存储顺序不一致
 * HashMap 是无序的 LinkedHashMap是有序等等
 * Map集合存储顺序与Map集合遍历的顺序是无序的--散列的
 */
public class HashMap01 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Yxj001", "小黑");
        hashMap.put("Yxj002", "小白");
        hashMap.put("Yxj002", "小黄");// 会覆盖前面的
      /**  hashMap.remove("Yxj002","小白");
        hashMap.clear();// 清空所有
       hashMap.isEmpty(); 如果集合中存放的元素个数为0则返回true
       */
        String key="Yxj001";
        if (hashMap.containsKey(key)){ // containsKey 是boolean 判断集合中是否包含所指定的键
            System.out.println(key+"存在");
        }else {
            System.out.println(key+"不存在");
        }
        System.out.println(hashMap);
    }
}
