package com.collectionframe.march18th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * ��ȷcollection������ϵ���ص�
 * ���Ϻͷ��Ͳ�֧�ֻ����������ͣ�ֻ��֧��������������
 */
public class CollectionDemo01{
    public static void main(String[] args) {
        // ����  ���ظ� ������
        Collection list =new ArrayList();
        list.add("java");
        list.add("java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);
        // ���� ���ظ� ������
        Collection list1 =new HashSet();
        list1.add("java");
        list1.add("java");
        list1.add("Mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);
    }
}
