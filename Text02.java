package Tjise.daxue;

/**
 * 定义一个方法，用于比较两个int类型数组是否相同
 */
public class Text02 {
    public static void main(String[] args) {
        //定义两个数组
        int[] arr1={1,2,3};
        int[] arr2={1,3};
       boolean b= B(arr1,arr2);
        System.out.println(b);
    }

    /**
     *
     * @param arr1 数组1
     * @param arr2 数组2
     * @return boolean 如果返回true则两个数组中的数组中的元素
     */
    public static boolean B(int[] arr1,int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i=0;i< arr1.length;i++){
                if(arr1[i]!=arr2[i]){//注意逻辑思路
//                    System.out.println("两个数组相同");
//                    return true;
                    return false;
                }
//                else System.out.println("两个数组内容不相同");
//                return false;
            }
        } else {
         return false;
        }
       return true;
    }
}
