package com.collectionframe.march20thMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> maps=new HashMap<>();
        maps.put("���Ƕ���",3);
        maps.put("Java",1);
        maps.put("������Ʒ",1000);
        maps.put("���",100);
        maps.put("�ֱ�",10);
        System.out.println(maps);

        // ͨ������Map�ķ��� entrySet��Map����ת����Set������ʽ
        // 1.��Map����ת����Set����
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        // 2.��ʼ����
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"-====>"+value);
        }
        System.out.println("--------���������--------");
        maps.forEach((k,v)-> System.out.println(k+"===>"+v));
    }
}
