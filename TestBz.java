package com.duixiang.day14;

/**
 * 包装类型底层设计原理
 *int 与Integer 区别
 * int属于基本数据类型 Integer属于int包装 对象 类
 * 基本数据类型 存放在栈空间中--局部变量表（方法）
 * 包装类属于对象 存放在 堆空间
 * 包装类 引用传递
 * 基本数据类型 值传递
 * Integer 属于包装类 默认是为null
 * int基本数据类型 默认值0
 */
public class TestBz {
    public static void main(String[] args) {
        Integer integer1=666;
        //new Integer();integer1 对象 Integer  成员属性 value赋值
        int int1=666;
    }

}
