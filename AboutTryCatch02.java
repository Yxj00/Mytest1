package aboutObject01.aboutException.march13th;

public class AboutTryCatch02 {
    public static void main(String[] args) {
        int x=100,y=0;
        try {
            //1.�쳣
            System.out.println(x/y);
            System.out.println("�������");
        }catch (ArithmeticException e){
            //ƥ��ɹ�
            System.out.println(e.getMessage());/// by zero
            System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
            e.printStackTrace();
            System.out.println("��������ѧ�쳣");
        }finally {
            System.out.println("��Ҫִ��");
        }
        //ƥ��ɹ��˳����������
        //ƥ��ʧ���ˣ������ӡ��仰
        System.out.println("main�������н���");
    }
}
