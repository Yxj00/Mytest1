package aboutObject01.object02.march9th;

public class PartClass {
    // �ֲ��ڲ��� �������涨���
    private  String name="��ʼ��";
    public  void partMethod(){
        class InnerClass{
            public void partInnerMethod(){
                System.out.println(name);
            }
        }
        /**
         * ʹ���� ����Ҫ��������
         * ��Ȼ�ڷ������������࣬���÷�ΧҲ��ֻ���ڷ�����
         */
        InnerClass ic = new InnerClass();
        ic.partInnerMethod();
    }
}
