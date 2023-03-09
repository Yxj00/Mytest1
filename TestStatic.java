package aboutObject01.object02.march9th;

public class TestStatic {
    public static void main(String[] args) {
        /**
         * 不需要依附于任何对象 直接就能创建静态内部类的对象
         * 外部类.内部 直接new出来
         */
        StaticClass01.Inner s1 = new StaticClass01.Inner();
        s1.test();
        /**
         * 如果没有调用就不会去加载外部类
         * 只会对应加载内部类的class文件
         */
    }
}
