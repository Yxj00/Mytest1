package aboutObject01.aboutException.march13th;

public class TestException01 {
    public static void main(String[] args) {
        // �쳣
        System.out.println("��ʾ�쳣");
//        System.out.println(100/0);
        // ArithmeticException: / by zero ��ʾһ���쳣���� ��ѧ�쳣
        System.out.println(111);
        /**
         * OutOfMemoryError �����ڴ��������
         */
        int[] ints = new int[1024 * 1024 * 1024];
    }
}
