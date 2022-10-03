package Tjise.daxue;

public class Text5 {
    /**
     * 方法的案例遍历数组
     * 要求遍历数组中的每个元素的结果都在同一行上
     * @param args
     */
    public static void main(String[] args) {
        int[] arr={22,33,44,55,66,77,88,99};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");//加制表符分隔
        }
        System.out.println();
        arr(arr);
    }
    public static void arr(int[] arr){
        if (arr==null){
            return;//如果传递的是一个空数组，后面的代码就不会执行
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i< arr.length-1)//考察对数组长度的运用 8-1
                System.out.print(",");
        }
    }
}
