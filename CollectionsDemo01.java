package com.collectionframe.march19th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ŀ��  Collections�������ʹ��
 * java.utils.Collections  �Ǽ��Ϲ�����  �������ڼ���  �������������ϵĹ�����
 * shift+f6  ѡһ����
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
      List<String> names = new ArrayList<>();
        Collections.addAll(names,"������","������","���޼�","½С��");
        System.out.println(names);

        // public static void shuffle(List<?> list):���Ҽ���˳��
        Collections.shuffle(names);
        System.out.println(names);
        /**
         * Collections.sort �Դ��Ƚ�������
         */
    }
}
