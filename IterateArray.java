package aboutObject01.object01.marchSeventh;

import java.util.Arrays;

public class IterateArray{
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,10};
        // ��ǿforѭ��
        for (int x:ints){
            System.out.println(x);
        }
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a.equals(b));// false
        System.out.println(Arrays.equals(a,b));// true

        /**
         * ���ڻ�������������˵���ǲ�֧���Զ�װ��Ͳ����
         * ��Ϊint���͵����鲻�ܱ�object���ͱ�������
         */


        /*
        ջ��arr --- ָ�򲻿ɱ�
        ���� -- new int[]{1,2}--�����
         */
        final int[] arr=new int[]{1,2};
        arr[0]=3;// ���Ը�
    }
}
