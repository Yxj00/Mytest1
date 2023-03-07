package aboutObject01.object01.marchSeventh;

import java.util.Arrays;

public class IterateArray{
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,10};
        // 增强for循环
        for (int x:ints){
            System.out.println(x);
        }
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a.equals(b));// false
        System.out.println(Arrays.equals(a,b));// true

        /**
         * 对于基本类型数组来说，是不支持自动装箱和拆箱的
         * 因为int类型的数组不能被object类型变量接收
         */


        /*
        栈中arr --- 指向不可变
        堆里 -- new int[]{1,2}--随意改
         */
        final int[] arr=new int[]{1,2};
        arr[0]=3;// 可以改
    }
}
