package com.collectionframe.march20thMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Ŀ��:��ʶMap��ϵ���ص㣺���ռ����� ���ظ� ������ ֵ����Ҫ��
 */
public class MapDemo1 {
    public static void main(String[] args) {
        // ����һ��map���϶���
        Map<String,Integer> maps=new HashMap<>();
        maps.put("���Ƕ���",3);
        maps.put("Java",1);
        maps.put("Java",1);// ����ǰ�������
        maps.put("���",100);
        maps.put(null,null);
        System.out.println(maps);
        System.out.println("--------------------");
        Map<String,Integer> maps1=new LinkedHashMap<>();// ���� ���ظ� ������
        maps1.put("���Ƕ���",3);
        maps1.put("Java",1);
        maps1.put("Java",1);// ����ǰ�������
        maps1.put("���",100);
        maps1.put(null,null);
        System.out.println(maps1);
    }
}
