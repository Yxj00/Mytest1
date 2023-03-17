package com.collectionframe.march17th;
import java.util.ArrayList;
public class TestCollection01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("名字:小孙  品种:边牧 年龄:1");
        list.add("名字:小浩  品种:金毛 年龄:2");
        list.add("名字:小晨  品种:哈士奇 年龄:1.5");
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("狗狗总数有:"+list.size()+"只");
    }
}
