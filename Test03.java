package com.collectionframe.march7th;

import java.util.HashMap;
import java.util.HashSet;

/**
 * HashMap集合存入学生对象
 */
public class Test03 {
    public static void main(String[] args) {
        HashMap<Integer, Student01> hashMap = new HashMap<>();
        hashMap.put(1, new Student01("YXJ", 22));
        hashMap.put(2, new Student01("张三", 23));
        hashMap.put(3, new Student01("李四", 24));
        for (Integer key:hashMap.keySet()){
            Student01 s = hashMap.get(key);
            System.out.println("学号:"+key+",姓名："+s.getName()+",年龄:"+s.getAge());
        }
    }
}
