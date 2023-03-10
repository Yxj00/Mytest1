package aboutObject01.object02.march10th;

public interface Inner {
    void innerMethod();
    default void test(){ // 可选择是否实现
        System.out.println("我是默认实现");
    }
}
