package com.collectionframe.March4th;

import java.util.HashMap;
import java.util.Map;

/**
 * Map�����ص�:
 * 1��ӳ���ֵ�Ե���ʽ key��value ��� K v
 * 2. Map������ key �ǲ������ظ��ģ�����value����
 * ���key����  ֱ���޸�valueֵ
 * 3. Map������ɢ�д������ ���Ի����ɢ�е�����������ݺʹ洢˳��һ��
 * HashMap ������� LinkedHashMap������ȵ�
 * Map���ϴ洢˳����Map���ϱ�����˳���������--ɢ�е�
 */
public class HashMap01 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Yxj001", "С��");
        hashMap.put("Yxj002", "С��");
        hashMap.put("Yxj002", "С��");// �Ḳ��ǰ���
      /**  hashMap.remove("Yxj002","С��");
        hashMap.clear();// �������
       hashMap.isEmpty(); ��������д�ŵ�Ԫ�ظ���Ϊ0�򷵻�true
       */
        String key="Yxj001";
        if (hashMap.containsKey(key)){ // containsKey ��boolean �жϼ������Ƿ������ָ���ļ�
            System.out.println(key+"����");
        }else {
            System.out.println(key+"������");
        }
        System.out.println(hashMap);
    }
}
