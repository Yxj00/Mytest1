package com.duixiang.day19;

import java.util.ArrayList;

public class TestIterator {
    /**
     * ÊÖÐ´µü´úÆ÷
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Yxj001");
        list.add("Yxj002");
        list.add("Yxj003");
        YxjIterator yxjIterator = new YxjIterator(list);
//        System.out.println(yxjIterator.next());
//        System.out.println(yxjIterator.next());
//        System.out.println(yxjIterator.next());
//        System.out.println(yxjIterator.next());
        while (yxjIterator.hasNext()){
            System.out.println(yxjIterator.next());
        }
    }
}
