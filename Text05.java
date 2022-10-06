package Tjise.daxue;

/**
 * 小案例  如何反转一个数组
 */
public class Text05 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,44,33};
        invert(arr1);
    }
    public static void invert(int[] arr){
        int start,end,temp;
        for (start=0,end=arr.length-1;start<end;start++,end--){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
        }
       for (int i=0;i< arr.length;i++){
           System.out.print(arr[i]+"\t");
       }
    }
}
