package com.collectionframe.march17th;
import java.util.ArrayList;
public class TestCollection01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("����:С��  Ʒ��:���� ����:1");
        list.add("����:С��  Ʒ��:��ë ����:2");
        list.add("����:С��  Ʒ��:��ʿ�� ����:1.5");
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("����������:"+list.size()+"ֻ");
    }
}
