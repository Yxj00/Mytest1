package com.collectionframe.march19th;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        //1.����һ��ArrayList���϶���
        //List������  ���ظ�  ������
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Mysql");
        list.add("Mysql");
        // 2.��ĳ������λ�ò���Ԫ��
        list.add(2,"HTML");
        System.out.println(list);
        // 3.��������ɾ��Ԫ�أ����ر�ɾ��Ԫ��
        System.out.println(list.remove(2));
        System.out.println(list);

        // 4.����������ȡԪ��
        System.out.println(list.get(2));
        // 5. �޸�����λ�ô���Ԫ��
        //�����޸�ǰ������
        System.out.println(list.set(1, "С��"));//java
        System.out.println(list);
    }
}
