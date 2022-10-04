package Tjise.daxue;

/**
 * 求数组元素的和
 */
public class Text01 {
    public static void main(String[] args) {
        int[] arr={71,27,33,22,100,87,77,57};
//        int sum=Sum(arr);
        System.out.println("满足条件的和为:"+Sum(arr));
    }
    public static int Sum(int[] arr){
        int sum=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]%10!=7&&arr[i]/10%10!=7&&arr[i]%2==0){//求和的元素个位和十位都不为7且只能是偶数
                sum+=arr[i];
            }
        }
        return sum;
    }
}
