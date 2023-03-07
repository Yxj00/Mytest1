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
         * ���ݼ���ȡֵ
         */
        hashMap.put("Yxj01", "YXJ");
        hashMap1.put(1, "YXJ01");
        hashMap2.put(1, 1);
        System.out.println(hashMap.get("Yxj01"));
        System.out.println(hashMap.get("Yxj"));// null
        System.out.println(hashMap1.get(1));
        System.out.println(hashMap1.get(2));// null
        System.out.println(hashMap2.get(1));
        System.out.println(hashMap2.get(2));// ����null
        /**
         * ��ȡ���м��ļ���
         */
        System.out.println("��ȡ���м��ļ���(����Set����)");
        Set<String> s=hashMap.keySet();
        for (String str:s){
            System.out.println(str);
        }
        System.out.println("��ȡ���м��ļ���(����Collection����)");
        Collection<String> values = hashMap.values();
        for (String str:values){
            System.out.println(str);
        }
        // ��ȡ���м�ֵ����ļ���
        System.out.println("��ȡ���м�ֵ����ļ���");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        // HashMap���ϵײ��ֵ����η�װ  ����ͨ��Map�ӿ��е�entry����
        for (Map.Entry<String, String> str:entries){
            System.out.println(str);
        }
        // ���������Ӧ��key�򷵻����Ӧ��value,���򷵻ظ�����Ĭ��ֵdefaultValue
        String yxj01 = hashMap.getOrDefault("Yxj01", "û���ҵ�");
        System.out.println(yxj01);
    }
}
