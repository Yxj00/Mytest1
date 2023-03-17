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
         * 注意：
         * 1.默认情况下会认为传入的是int类型的值
         */

        list.remove((Integer)10);
        System.out.println(list);

        /**
         * 2.集合类在删除元素的时候，只会调用‘equals’方法判断
         * 而不是进行==判断
         * 如果说两个对象使用‘equals’方法相等，那么在集合中就是相同的元素
         */
        List<Integer> list1 =new ArrayList<>();
        list1.add(new Integer(10));
        list1.remove(new Integer(10));
        System.out.println(list1);
        /**
         * 3.列表中允许存在相同的元素，可以添加一模一样的元素
         * 只会删除排在前面的第一个元素
         */
        /**
         * 集合支持嵌套使用
         */
       List<List<String>> list2 = new LinkedList<>();
       list2.add(new LinkedList<>());
        System.out.println(list2.get(0).isEmpty());

        /**
         * 只读List
         * 报异常:UnsupportedOperationException
         */
        List<String> list3= Arrays.asList("a","b","c");
//        list3.remove(1);
        /**
         *作为参数传入，就可以正常使用
         */
        List<String> list4=new ArrayList<>( Arrays.asList("a","b","c"));
        list4.remove(1);
        System.out.println(list4);
    }
}
