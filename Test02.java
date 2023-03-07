package com.collectionframe.march7th;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Yxj01", "YXJ");
        hashMap.put("Yxj02", "����");
        hashMap.put("Yxj03", "����");
        // ��ʽһ �������ǵ�HashMap����
        /**
         * ˼·����:
         * 1.�Ȼ�ȡ��HashMap�����еļ�ֵ
         * 2.�ٵ���get���� ��ȡ��Ӧ��ֵ��valueֵ
         */
        System.out.println("--------��ʽһ----------");

        Set<String> keys = hashMap.keySet();
        for (String key:keys){
//            System.out.println(str);
            // ����get���� ��ȡ��Ӧ��ֵ��valueֵ
            String value = hashMap.get(key);
            System.out.println(key+","+value);
        }
        System.out.println("--------��ʽһ�����Ż�----------");
        for (String key:hashMap.keySet()){
            String value = hashMap.get(key);
            System.out.println(key+","+value);
        }


        System.out.println("--------��ʽ��----------");
        /**
         * ��ʽ�� ����HashMap����
         * entrySet() Map������ ��ֵ��
         */
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String,String> key:entries){
            System.out.println(key);
        }
        System.out.println("---------��ʽ����һ�ֱ�����ʾ------------");
        for (Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        System.out.println("----------�����Ż�--------------------");
        for (Map.Entry<String,String> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
