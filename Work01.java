package com.duixiang.day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Work01 {
    public static void main(String[] args) {
//        String[] arr = new String[3];//����һ������  ���3��Ԫ��
//        arr[0]="yxj";
//        arr[1]="yxj1";
//        arr[2]="yxj2";
//        arr[3]="yxj3";//�ᱨ��
        /**
         *   ���ʵ�ֶ�̬����
         *
         *   �Զ�ʵ����������
         */
        /**
         * <String> ���� ��������ֻ�ܹ����String����
         */
        Collection collection=new ArrayList<>();//��̬
        collection.add("Yxj");//��������������
        HashMap<String,String> hashMap=new HashMap<>();//����  key��ʾ��һ�У�value��ʾ �ڶ���
        hashMap.put("001", "Yxj");
        List<String> arrayList = new ArrayList<String>();
        //arrayList��������
        arrayList.add("Yxj001");
        arrayList.add("Yxj002");
        arrayList.add("Yxj003");
        System.out.println("�����д����Ԫ�ظ���:"+arrayList.size());//size ����arrayList�����Ԫ������
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));//ͨ������ֵ��ȡ�����е�Ԫ��
        }
        System.out.println("--------------------------");
        arrayList.set(0, "Yxj004");//�滻ָ��������Ԫ��
        System.out.println(arrayList.get(0));//�ٻ�ȡ

        System.out.println("-------------------------");
        arrayList.remove(0);
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));//ͨ������ֵ��ȡ�����е�Ԫ��
        }
        System.out.println(arrayList.get(0));
//        List<Integer> arrayList1 = new ArrayList<>();//���� �û����������͵İ�װ��
//        arrayList1.add(123);
    }
}
