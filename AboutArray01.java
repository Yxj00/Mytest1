package aboutObject01.aboutException.march13th;

import java.util.Arrays;

public class AboutArray01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,7,98,4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //fill 填充
        int[] arr1 = new int[10];
        Arrays.fill(arr1,66);
        System.out.println(Arrays.toString(arr1));


        //a数组之间的拷贝
        int[] target = new int[10];

        System.arraycopy(arr,1,target,1,5);
        System.out.println(Arrays.toString(target));
        /**
         * Object src:原数组
         * int srcPos:从元数据的起始位置开始
         * Object dest:目标数组
         * int destPos: 目标数组的开始起始位置
         * int length:要copy的数组长度
         */
        /**
         * 多维数组
         */
        int[][] array = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(array));//[[I@7ef20235, [I@27d6c5e0]
        //Arrays.deepToString  可以用于多维数组
        System.out.println(Arrays.deepToString(array));

    }
}
