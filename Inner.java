package aboutObject01.object02.march10th;

public interface Inner {
    void innerMethod();
    default void test(){ // ��ѡ���Ƿ�ʵ��
        System.out.println("����Ĭ��ʵ��");
    }
}
