package aboutObject01.object01.marchsixth;

public class Student extends Person implements Study,A{
   public String name="lili";// ���ܱ�����
    @Override
    public void study() {
        System.out.println("����ѧ��");
    }

    @Override
    public void aboutA() {
        System.out.println("����A����");
    }
}
