package com.collectionframe.march17th;

import java.util.Iterator;
import java.util.Vector;

public class AboutVector02 {
    public static void main(String[] args) {
        // ����
        Vector vector = new Vector(20);
        vector.add("a");
        vector.add("a");
        vector.add("c");
        vector.add(2, 1);
        // ���ص�ǰ����������ֵ
        System.out.println(vector.capacity());
        for (Object s:vector){
            System.out.println(s);
        }
    }
}
