package com.collectionframe.march19th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDelete {
    public static void main(String[] args) {
        // 1.׼����������
        List<String> list=new ArrayList<>();
        list.add("С��");
        list.add("Java");
        list.add("Java");
        list.add("С��");

        /**
         * ����ɾ��ȫ����Java��Ϣ
         * a.����������ɾ��
         */
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ele = it.next();
            if ("Java".equals(ele)){
//                list.remove(ele);����Ʊ���
                it.remove();// ʹ�õ����� ɾ����ǰ����Ԫ�أ����Ҳ������
            }
        }
        System.out.println(list);

        // b.ʹ��foreach����ɾ�� ��ǿfor  ��bug
//        for (String s : list) {
//            if ("Java".equals(s)){
//                list.remove("Java");
//            }
//        }

    }
}
