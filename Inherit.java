package com.duixiang;

/**
 * 继承测试
 */
public class Inherit extends EncapSulation{
    public static void main(String[] args) {
        EncapSulation en=new EncapSulation();
        en.setName("玄机");
        en.setAge(22);
        System.out.println(en.getName()+"--"+en.getAge());
    }
}
