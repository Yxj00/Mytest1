package aboutObject01.aboutException.march13th;

public class TestException01 {
    public static void main(String[] args) {
        // 异常
        System.out.println("演示异常");
//        System.out.println(100/0);
        // ArithmeticException: / by zero 表示一种异常类型 数学异常
        System.out.println(111);
        /**
         * OutOfMemoryError 错误，内存溢出错误
         */
        int[] ints = new int[1024 * 1024 * 1024];
    }
}
