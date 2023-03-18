package com.collectionframe.march18th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestMovie {
    public static void main(String[] args) {
        // 定义一个电影类
        //2.定义一个集合对象存储3部电影对象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《你好，李焕英》",9.5,"贾玲，张小斐，沈腾"));
        movies.add(new Movie("《唐人街探案》",8.5,"王宝强，刘昊然"));
        movies.add(new Movie("《刺杀小说家》",8.6,"雷佳音，杨幂"));
        //遍历集合容器中的每一个电影对象
        System.out.println("--------迭代器--------");
        Iterator<Movie> it = movies.iterator();
        while (it.hasNext()){
            Movie m = it.next();
            System.out.println("片名:"+m.getName());
            System.out.println("评分:"+m.getScore());
            System.out.println("主演:"+m.getActor());
        }
        System.out.println("---------增强for循环-----");
        for (Movie m : movies) {
            System.out.println("片名:"+m.getName());
            System.out.println("评分:"+m.getScore());
            System.out.println("主演:"+m.getActor());
        }
        System.out.println("-------foreach------");
        movies.forEach(System.out::println);
    }
}
