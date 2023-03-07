package com.collectionframe.march7th;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Yxj01", "YXJ");
        hashMap.put("Yxj02", "张三");
        hashMap.put("Yxj03", "李四");
        // 方式一 遍历我们的HashMap集合
        /**
         * 思路分析:
         * 1.先获取到HashMap中所有的键值
         * 2.再调用get方法 获取对应键值的value值
         */
        System.out.println("--------方式一----------");

        Set<String> keys = hashMap.keySet();
        for (String key:keys){
//            System.out.println(str);
            // 调用get方法 获取对应键值的value值
            String value = hashMap.get(key);
            System.out.println(key+","+value);
        }
        System.out.println("--------方式一代码优化----------");
        for (String key:hashMap.keySet()){
            String value = hashMap.get(key);
            System.out.println(key+","+value);
        }


        System.out.println("--------方式二----------");
        /**
         * 方式二 遍历HashMap集合
         * entrySet() Map集合中 键值对
         */
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String,String> key:entries){
            System.out.println(key);
        }
        System.out.println("---------方式二另一种遍历表示------------");
        for (Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        System.out.println("----------代码优化--------------------");
        for (Map.Entry<String,String> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
