package com.duixiang.day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test01 {
    /**
     * ������--���ڼ�����ר�õ�
     * @param args
     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("yxj");
        collection.add("Yxj01");
        collection.add("Yxj02");
        System.out.println("ʹ�ü�����ר�õ�������������");
        Iterator<String> iterator = collection.iterator();//������
//        System.out.println(iterator.next());//���õ�һ��next���� ȡ����һ��Ԫ��
//        System.out.println(iterator.next());//���õڶ���next���� ȡ���ڶ���Ԫ��
//        System.out.println(iterator.next());//���õ�����next���� ȡ��������Ԫ��
        /**
         * next�ײ��ʹ�ü����� ÿ�ε���next����  ����+1
         */
//        for (int i = 0; i < collection.size(); i++) {
//            System.out.println(iterator.next());
//        }
//        System.out.println(iterator.hasNext());//�ж�Ԫ��ֵ�Ƿ���Ի�ȡ ������Ի�ȡ �򷵻�true ���򷵻�false
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
