package aboutObject01.object01.marchSeventh;

public class MultiArray {
    public static void main(String[] args) {
        /**
         * 多维数组
         * 动态实现
         */
        int[][] arr1 = new int[2][10];
        int[][] arr2={{1,2,3},{3,4,5},{9,0,7,5,6}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
