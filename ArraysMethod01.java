package aboutObject01.object02.march15th;

import java.util.Arrays;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,5,6,5,9};
        Arrays.sort(arr,(o1,o2)->o2-o1);
        System.out.println(Arrays.toString(arr));
    }
}
