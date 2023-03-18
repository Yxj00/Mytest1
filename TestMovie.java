package com.collectionframe.march18th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestMovie {
    public static void main(String[] args) {
        // ����һ����Ӱ��
        //2.����һ�����϶���洢3����Ӱ����
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("����ã����Ӣ��",9.5,"���ᣬ��С쳣�����"));
        movies.add(new Movie("�����˽�̽����",8.5,"����ǿ�����Ȼ"));
        movies.add(new Movie("����ɱС˵�ҡ�",8.6,"�׼���������"));
        //�������������е�ÿһ����Ӱ����
        System.out.println("--------������--------");
        Iterator<Movie> it = movies.iterator();
        while (it.hasNext()){
            Movie m = it.next();
            System.out.println("Ƭ��:"+m.getName());
            System.out.println("����:"+m.getScore());
            System.out.println("����:"+m.getActor());
        }
        System.out.println("---------��ǿforѭ��-----");
        for (Movie m : movies) {
            System.out.println("Ƭ��:"+m.getName());
            System.out.println("����:"+m.getScore());
            System.out.println("����:"+m.getActor());
        }
        System.out.println("-------foreach------");
        movies.forEach(System.out::println);
    }
}
