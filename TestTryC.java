package com.duixiang.day17;

public class TestTryC {
    public static void main(String[] args){
        System.out.println("开始");
        try {
            //将可能会发生异常的代码包裹起来
            a1();
        }catch (ArrayIndexOutOfBoundsException e){
           //捕获成功
            System.out.println("您访问的index 下标越界了");
        }
        System.out.println("结束");
    }
    public static void a1(){
        int[] arr1={1,2,4};
        System.out.println(arr1[3]);
    }
}
