package aboutObject01.aboutException.march13th;


public class TestStudent {
    public static void main(String[] args) {
        Student<Integer> stu = new Student<>("ll","1",11);
        System.out.println(stu.getAge());
        Student<?> stu2 = new Student<>("ksl","11","12");
        //?通配符  由于类型不确定，所以具体类型同样会变成Object

        // 只能放引用类型  不能放基本类型
        Student<int[]> stu3 = new Student<>("jkjk","12",new int[]{1,2});

    }
}
