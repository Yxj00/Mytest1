package com.collectionframe.march19th;

public class GenericDemo {
    public static void main(String[] args) {
        String[] names={"С��","С��","С��"};
        printArray(names);
        Integer[] ages={10,20,30};
        printArray(ages);
    }

    /**
     * ���ͷ���
     * @param arr
     * @param <T>
     */
    public static <T> void printArray(T[] arr){
        if (arr==null){
            System.out.println(arr);
        }else {
            // �ַ�����ƴ��
            StringBuilder sbu = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sbu.append(arr[i]).append(i== arr.length-1?"":",");
            }
            sbu.append("]");
            System.out.println(sbu);
        }
    }
}
