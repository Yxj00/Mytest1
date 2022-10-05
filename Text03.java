package Tjise.daxue;

import java.util.Scanner;

/**
 * 查找数组中的元素，优化后的代码
 */
public class Text03 {
    public static void main(String[] args) {
        //1.首先定义一个数组
        int[] arr={28,33,45,89,10};
        //2.录入用户输入的数据
        Scanner sc=new Scanner(System.in);
        System.out.println("请用户输入数据:");
        int userdata=sc.nextInt();
        //3.用方法获取索引值
        int index=getIndex(userdata,arr);
        System.out.println(index==-1?"对不起 您所找数据不在数组中":"查找到您输入的数据位置为:"+index);
    }

    /**
     *
     * @param userdata
     * @param arr
     * @return
     */
    public static int getIndex(int userdata,int[] arr){
        for (int i=0;i< arr.length;i++){
            if (userdata==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
