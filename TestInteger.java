package com.duixiang.day13;

/**
 * ��ν�String����ת����int����
 */
public class TestInteger {
    public static void main(String[] args) {
        String str="456";//Ҫ���ַ������Ǵ�����
        //Integer��int���͵İ�װ��
        //����1
        Integer integer = Integer.valueOf(str);
        //��ת����Integer��װ�� �ٵ���intValue����  ����int����
        int intA = integer.intValue();
        System.out.println(integer);
        System.out.println(intA);
        System.out.println("-------------------");
        //����2  ����ʹ��parseInt����
        int intB = Integer.parseInt(str);
        System.out.println(intB);
        long l1 = Long.parseLong(str);
        boolean b1 = Boolean.parseBoolean(str);
        System.out.println(l1);
        System.out.println(b1);
    }
}
