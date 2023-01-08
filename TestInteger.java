package com.duixiang.day13;

/**
 * 如何将String类型转换成int类型
 */
public class TestInteger {
    public static void main(String[] args) {
        String str="456";//要求字符串里是纯数字
        //Integer是int类型的包装类
        //方法1
        Integer integer = Integer.valueOf(str);
        //先转换成Integer包装类 再调用intValue方法  返回int类型
        int intA = integer.intValue();
        System.out.println(integer);
        System.out.println(intA);
        System.out.println("-------------------");
        //方法2  建议使用parseInt方法
        int intB = Integer.parseInt(str);
        System.out.println(intB);
        long l1 = Long.parseLong(str);
        boolean b1 = Boolean.parseBoolean(str);
        System.out.println(l1);
        System.out.println(b1);
    }
}
