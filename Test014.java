package com.duixiang.day14;

/**
 * 装箱:自动将基本数据类型转换成包装类型  基本数据类型-->包装类型
 * 拆箱:自动将包装类型转换成基本数据类型   包装类型 -->基本数据类型
 */
public class Test014 {
    public static void main(String[] args) {
        Integer a=88;//装箱
        /**
         * 拆箱底层 a；包装类型
         * int z=a;是走的Integer.intValue()方法
         */
        int z=a;//拆箱
        Integer b=0;
        b+=1;
        /**
         * b(Integer.intValue()+1,b+1==自动拆箱=0+1)
         * b+1的结果赋值给b=0+1 b(包装类型)  1是基本数据类型  Integer b=Integer.valueOf(0+1)自动装箱的过程
         */
        if (b instanceof Integer){
            System.out.println("我是Integer类型！");
        }
    }
}
