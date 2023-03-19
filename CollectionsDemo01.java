package com.collectionframe.march19th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 目标  Collections工具类的使用
 * java.utils.Collections  是集合工具类  并不属于集合  是用来操作集合的工具类
 * shift+f6  选一样的
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
      List<String> names = new ArrayList<>();
        Collections.addAll(names,"楚留香","胡铁花","张无忌","陆小凤");
        System.out.println(names);

        // public static void shuffle(List<?> list):打乱集合顺序
        Collections.shuffle(names);
        System.out.println(names);
        /**
         * Collections.sort 自带比较器对象
         */
    }
}
