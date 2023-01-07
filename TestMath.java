package com.duixiang.day12;

/**
 * math类
 * 1,Math类是没有系统公开访问构造函数
 * 2，Math类 无参构造函数直接是私有的 无法 new Math类
 * 3，Math 使用api访问都是加上static 使用该方法 直接通过类名称.方法名称
 *
 */
public class TestMath {
    public static void main(String[] args) {
        System.out.println("----Math.abs() 返回绝对值----");
        System.out.println(Math.abs(-11));
        System.out.println(Math.abs(-12.23));
        System.out.println("----Math.ceil() 返回大于或等于参数-----");
        //ceil()  理解为向上取整  double类型的整数  小数部分变为0
        System.out.println(Math.ceil(99.23));
        System.out.println(Math.ceil(99.99));
        System.out.println(Math.ceil(88.00));
        System.out.println(Math.ceil(-0.99));
        System.out.println(Math.ceil(99));
        System.out.println(Math.ceil(0));
        System.out.println("----Math.floor()返回小于或等于参数----");
        //floor()  可理解为向下取整  double类型的整数 小数部分变为0
        System.out.println(Math.floor(99.23));
        System.out.println(Math.floor(99.99));
        System.out.println(Math.floor(-0.99));
        System.out.println(Math.floor(99));
        System.out.println(Math.floor(0));
        System.out.println("----四舍五入 round方法----");
        System.out.println(Math.round(12.23));
        System.out.println(Math.round(12.53));//double   返回最接近的long类型
        System.out.println(Math.round(12.4));
        System.out.println(Math.round(12.5));//float类型 返回最接近的int类型
        System.out.println("----Math.pow() 返回a的b的幂----");
        System.out.println(Math.pow(2, 3));//返回double类型  2^3
        System.out.println("----Math.random() 生成0-1.0的随机数 不到1.0");
        System.out.println(Math.random());
        System.out.println((int) (Math.random()*100));
    }
}
