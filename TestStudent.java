package aboutObject01.aboutException.march13th;


public class TestStudent {
    public static void main(String[] args) {
        Student<Integer> stu = new Student<>("ll","1",11);
        System.out.println(stu.getAge());
        Student<?> stu2 = new Student<>("ksl","11","12");
        //?ͨ���  �������Ͳ�ȷ�������Ծ�������ͬ������Object

        // ֻ�ܷ���������  ���ܷŻ�������
        Student<int[]> stu3 = new Student<>("jkjk","12",new int[]{1,2});

    }
}
