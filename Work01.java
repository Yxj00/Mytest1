package com.duixiang.day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Work01 {
    public static void main(String[] args) {
//        String[] arr = new String[3];//创建一个数组  存放3个元素
//        arr[0]="yxj";
//        arr[1]="yxj1";
//        arr[2]="yxj2";
//        arr[3]="yxj3";//会报错
        /**
         *   如何实现动态数组
         *
         *   自动实现数组扩容
         */
        /**
         * <String> 泛型 集合容器只能够存放String类型
         */
        Collection collection=new ArrayList<>();//多态
        collection.add("Yxj");//向容器存入数据
        HashMap<String,String> hashMap=new HashMap<>();//多列  key表示第一列，value表示 第二列
        hashMap.put("001", "Yxj");
        List<String> arrayList = new ArrayList<String>();
        //arrayList对象名称
        arrayList.add("Yxj001");
        arrayList.add("Yxj002");
        arrayList.add("Yxj003");
        System.out.println("集合中存入的元素个数:"+arrayList.size());//size 返回arrayList里面的元素数量
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));//通过索引值获取集合中的元素
        }
        System.out.println("--------------------------");
        arrayList.set(0, "Yxj004");//替换指定索引的元素
        System.out.println(arrayList.get(0));//再获取

        System.out.println("-------------------------");
        arrayList.remove(0);
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));//通过索引值获取集合中的元素
        }
        System.out.println(arrayList.get(0));
//        List<Integer> arrayList1 = new ArrayList<>();//里面 用基本数据类型的包装类
//        arrayList1.add(123);
    }
}
