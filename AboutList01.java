package com.collectionframe.march17th;



import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AboutList01 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","c");
        // ������֧����ǿforѭ��������ֻ���﷨��
        for (String s:list){
            System.out.println(s);
        }
        // ������ʵ��
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        //java8��foreach����
        list.forEach(s-> System.out.println(s));
        // �������� lambda
        list.forEach(System.out::println);
    }
}
