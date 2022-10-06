package Tjise.daxue;

import java.util.Scanner;

/**
 * 小案例 评委打分，六个评委为参赛选手打分，分数为0-100的整数分
 * 要求去掉一个最高分和最低分
 */
public class Text04 {
    public static void main(String[] args) {
        //首先定义一个长度为6的数组
        int[] arr=new int[6];
        Scanner sc= new Scanner(System.in);
        //键盘录入评委的分数且存入数组中

        for (int i=0;i< arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个评委老师打分的分数:");
            arr[i]= sc.nextInt();
        }
        int max= getMax(arr);
        int min= getMin(arr);
        int sum=Sum(arr);
        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("参赛选手最终得分为:"+avg);
    }

    /**
     * 定义getMax方法获取最高分
     * @param arr
     * @return max
     */
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    /**
     * 定义getMin获取数组中的最小值
     * @param arr
     * @return min
     */
    public static int getMin(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    /**
     * 定义Sum方法求分数总和
     * @param arr
     * @return sum
     */
    public static int Sum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
