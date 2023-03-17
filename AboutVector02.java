package com.collectionframe.march17th;

import java.util.Iterator;
import java.util.Vector;

public class AboutVector02 {
    public static void main(String[] args) {
        // 向量
        Vector vector = new Vector(20);
        vector.add("a");
        vector.add("a");
        vector.add("c");
        vector.add(2, 1);
        // 返回当前容器的向量值
        System.out.println(vector.capacity());
        for (Object s:vector){
            System.out.println(s);
        }
    }
}
