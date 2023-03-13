package aboutObject01.aboutException.march13th;

import java.util.Arrays;

public class AboutArray01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,7,98,4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //fill ���
        int[] arr1 = new int[10];
        Arrays.fill(arr1,66);
        System.out.println(Arrays.toString(arr1));


        //a����֮��Ŀ���
        int[] target = new int[10];

        System.arraycopy(arr,1,target,1,5);
        System.out.println(Arrays.toString(target));
        /**
         * Object src:ԭ����
         * int srcPos:��Ԫ���ݵ���ʼλ�ÿ�ʼ
         * Object dest:Ŀ������
         * int destPos: Ŀ������Ŀ�ʼ��ʼλ��
         * int length:Ҫcopy�����鳤��
         */
        /**
         * ��ά����
         */
        int[][] array = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(array));//[[I@7ef20235, [I@27d6c5e0]
        //Arrays.deepToString  �������ڶ�ά����
        System.out.println(Arrays.deepToString(array));

    }
}
