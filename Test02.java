package com.duixiang.day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Test02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yxj001");
        list.add("Yxj002");

        /**
         * Iterator ��ͷ��β������
         * list�����ж��е�ListIterator������ ��ͷ��β ���ߴ�β��ͷ������
         */
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("��ͷ��β");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("��β��ͷ");
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());

    }
}
