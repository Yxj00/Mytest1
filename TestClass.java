package aboutObject01.object02.march15th;

public class TestClass {
    public static void main(String[] args) {
        //��ȷ����
        ClassExtendsUp01<Integer> cls= new ClassExtendsUp01<>("123","11",22);
        ClassExtendsUp01<Float> cls1 = new ClassExtendsUp01<>("123","11",10.0f);
        //����ȷ����
        //��---�����޷�Χ֮�ڽ��б�д
        ClassExtendsUp01<?> cls2 = new ClassExtendsUp01<>("123","11",10.0);

    }
}
