package Tjise.daxue;

/**
 * 数组的最大值，
 * 设计一个方法用于获取数组中元素最大值，调用该方法并且输出结果
 */
public class Text6 {
    public static void main(String[] args) {
        int[] arr={22,44,66,88,11,55,99};
       int max= MAX(arr);
        System.out.println("数组中的最大值为"+max);
    }

    /**
     * 定义一个方法，需要查找到数组中的最大值
     * @param arr
     * @return
     */
    public static int  MAX(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
