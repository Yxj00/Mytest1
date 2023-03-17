package com.collectionframe.march17th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Attention01 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        /**
         * ע�⣺
         * 1.Ĭ������»���Ϊ�������int���͵�ֵ
         */

        list.remove((Integer)10);
        System.out.println(list);

        /**
         * 2.��������ɾ��Ԫ�ص�ʱ��ֻ����á�equals�������ж�
         * �����ǽ���==�ж�
         * ���˵��������ʹ�á�equals��������ȣ���ô�ڼ����о�����ͬ��Ԫ��
         */
        List<Integer> list1 =new ArrayList<>();
        list1.add(new Integer(10));
        list1.remove(new Integer(10));
        System.out.println(list1);
        /**
         * 3.�б������������ͬ��Ԫ�أ��������һģһ����Ԫ��
         * ֻ��ɾ������ǰ��ĵ�һ��Ԫ��
         */
        /**
         * ����֧��Ƕ��ʹ��
         */
       List<List<String>> list2 = new LinkedList<>();
       list2.add(new LinkedList<>());
        System.out.println(list2.get(0).isEmpty());

        /**
         * ֻ��List
         * ���쳣:UnsupportedOperationException
         */
        List<String> list3= Arrays.asList("a","b","c");
//        list3.remove(1);
        /**
         *��Ϊ�������룬�Ϳ�������ʹ��
         */
        List<String> list4=new ArrayList<>( Arrays.asList("a","b","c"));
        list4.remove(1);
        System.out.println(list4);
    }
}
