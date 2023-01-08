package com.duixiang.day13;

/**
 * 两个System中的方法  exit与currentTimeMillis
 */
public class TestSystem {
    public static void main(String[] args) {
//        System.exit(0);//正常退出是0  非0为异常退出
        long start = System.currentTimeMillis();//获取当前时间（从1970年1月1日） 毫秒 1s=1000ms
        System.out.println(start);
        for (int i = 0; i < 10000; i++) {
            System.out.println("Yxj");
        }
        long end = System.currentTimeMillis();
        System.out.println("循环10000花费"+(end-start)+"毫秒");
    }
}
