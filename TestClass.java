package aboutObject01.object02.march15th;

public class TestClass {
    public static void main(String[] args) {
        //明确类型
        ClassExtendsUp01<Integer> cls= new ClassExtendsUp01<>("123","11",22);
        ClassExtendsUp01<Float> cls1 = new ClassExtendsUp01<>("123","11",10.0f);
        //不明确类型
        //？---》上限范围之内进行编写
        ClassExtendsUp01<?> cls2 = new ClassExtendsUp01<>("123","11",10.0);

    }
}
