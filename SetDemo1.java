package com.collectionframe.march19th;

import java.util.Set;
import java.util.TreeSet;

/**
 * �۲�TreeSet������ֵ���Ե������������
 * ѧ����Զ������� �Ķ������ָ����������
 *
 * ����Integer��Double  �ٷ�Ĭ�ϰ��մ�С������������
 * �����ַ������ͣ�Ĭ�ϰ������ַ��ı����������
 * �����Զ���������Student����  TreeSet�޷�ֱ������
 */
public class SetDemo1 {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();// ���ظ� ������������
        sets.add(23);
        sets.add(2);
        sets.add(3);
        sets.add(32);
        sets.add(99);
        System.out.println(sets);

        Set<String> sets1 = new TreeSet<>();
        sets1.add("С��");
        sets1.add("С��");
        sets1.add("С��");
        sets1.add("С��");
        sets1.add("СС");
        System.out.println(sets1);
    }
}
