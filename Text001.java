package Tjise.daxue;

public class Text001 {
    /**
     *
     * 利用数组方法返回两数和为9的两个数的数组下标值
     * @param args
     */
    public static void main(String[] args) {
        int[] nums={2,7,11,22};
        int target=9;
        int[] sum=twoSum(nums,target);
        System.out.println("["+sum[0]+","+sum[1]+"]");
    }
    public static int[] twoSum(int[] nums,int target){
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    int[] arr={i,j};
                    return arr;
                }
            }
        }
        return null;
    }
}
