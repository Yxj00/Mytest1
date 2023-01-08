package com.duixiang.day13;


/**
 * String类中valueof方法
 */
public class TestStrV {
    public static void main(String[] args) {
        //如何将int类型转换成string类型
        //第一种  通过空字符串与int类型  使用+连接符连接
        int a=88;
        String a1=""+a;
        System.out.println(a1);
        //第二种方法 valueof方法
        String a2 = String.valueOf(a);//通过类名称(String).valueof
        System.out.println(a2);
        //使用String.valueOf方法 将int long double char boolean  直接转换成String
        boolean  flag=true;
        String sflag = String.valueOf(flag);
        System.out.println(sflag);
        System.out.println(sflag.getClass().getSimpleName());
    }
}
