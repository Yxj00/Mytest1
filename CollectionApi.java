package com.collectionframe.march18th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApi {
    public static void main(String[] args) {
        // hashSet:��ӵ�Ԫ�������򣬲��ظ���������
       Collection<String> list = new ArrayList<>();
       // 1.���Ԫ�� ��ӳɹ�����true
        list.add("java");
        System.out.println(list.add("HTML"));
        list.add("java");
        System.out.println(list);
        //2. ��ռ��ϵ�Ԫ��
//        list.clear();
//        System.out.println(list);
        // 3.�жϼ��ϵ�Ԫ���Ƿ�Ϊ�� �ǿշ���true����֮
        System.out.println(list.isEmpty());
        //4.��ȡ���ϵĴ�С
        System.out.println(list.size());
        // 5.�жϼ������Ƿ����ĳ��Ԫ��
        System.out.println(list.contains("java"));
        System.out.println(list.contains("����"));
        //6.ɾ��ĳ��Ԫ�أ�����ж���ظ���Ԫ��  Ĭ��ɾ��ǰ��ĵ�һ��
        System.out.println(list.remove("java"));
        System.out.println(list);
        // 7.�Ѽ���ת��������
        Object[] arrs=list.toArray();
        System.out.println("����"+Arrays.toString(arrs));
        System.out.println("------------��չ------------");
        Collection<String> c1=new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2=new ArrayList<>();
        c2.add("����");
        c2.add("������");
        // addAll��c2���ϵ�Ԫ��ȫ�����뵽c1��
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
