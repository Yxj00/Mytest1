package aboutObject01.object02.march9th;

public class StaticClass01 {
    static String name;
    /**
     * ��̬�ڲ���
     */
    static {
        System.out.println("�ⲿ��ĳ�ʼ��");
    }
    public static class Inner{
        static {
            System.out.println("���ڲ���ĳ�ʼ��");
        }
        static String name1;
        public  void test(){
            System.out.println("���Ǿ�̬�ڲ���");
            System.out.println(name);
            // ��̬�ڲ��������Ǿ�̬�� ���޷����ʵ��ⲿ��ķǾ�̬
        }
    }
}
