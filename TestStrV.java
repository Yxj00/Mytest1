package com.duixiang.day13;


/**
 * String����valueof����
 */
public class TestStrV {
    public static void main(String[] args) {
        //��ν�int����ת����string����
        //��һ��  ͨ�����ַ�����int����  ʹ��+���ӷ�����
        int a=88;
        String a1=""+a;
        System.out.println(a1);
        //�ڶ��ַ��� valueof����
        String a2 = String.valueOf(a);//ͨ��������(String).valueof
        System.out.println(a2);
        //ʹ��String.valueOf���� ��int long double char boolean  ֱ��ת����String
        boolean  flag=true;
        String sflag = String.valueOf(flag);
        System.out.println(sflag);
        System.out.println(sflag.getClass().getSimpleName());
    }
}
