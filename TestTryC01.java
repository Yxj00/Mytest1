package com.duixiang.day17;

public class TestTryC01 {
    public static void main(String[] args){
        System.out.println("开始");
        try {
            //将可能会发生异常的代码包裹起来
            a1();
        }catch (ArrayIndexOutOfBoundsException e){
            //捕获数组下标异常
            //捕获成功
            System.out.println("您访问的index 下标越界了");
            e.printStackTrace();
        }catch (NumberFormatException e){
            //捕获类型转换异常
            System.out.println("类型 转换异常");
            System.out.println( e.getMessage());//异常错误信息内容
        }
        System.out.println("结束");
    }

    /**
     * 程序报错后 会在catch里面查找匹配异常对象
     * 捕获成功  程序向下执行
     * 没有捕获到  程序中断
     */
    public static void a1(){
        int[] arr1={1,2,4};
        System.out.println(arr1[1]);
        String str="m123";
        int str1 = Integer.parseInt(str);

    }
}
