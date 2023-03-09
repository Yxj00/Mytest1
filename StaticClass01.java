package aboutObject01.object02.march9th;

public class StaticClass01 {
    static String name;
    /**
     * 静态内部类
     */
    static {
        System.out.println("外部类的初始化");
    }
    public static class Inner{
        static {
            System.out.println("内内部类的初始化");
        }
        static String name1;
        public  void test(){
            System.out.println("我是静态内部类");
            System.out.println(name);
            // 静态内部类由于是静态的 ，无法访问到外部类的非静态
        }
    }
}
