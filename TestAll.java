package aboutObject01.object01.marchsixth;

public class TestAll {
    public static void main(String[] args) {
        //�ӿڲ���ֱ�Ӵ�������
        // �ӿ�ʵ����Ķ����Խӿ�
        /*
        ����ת��
        ���뿴����������
        ���п�����������
        �޷�ʹ���౾��ķ����͸��෽��
        �����ӿ�ʹ��ʱ��ֻ�нӿڶ���ķ�����object�෽��
         */
        Study  stu = new Student();
        stu.study();
        //stu.name; --�޷�ʹ��

        /*
        �ӿ�ͬ��֧������ת��
        ����ת��
         */
        Study t=new Teacher();
        // ֱ���ж����ö����ǲ���Teacher����
        if (t instanceof Teacher){
            Teacher teacher= (Teacher) t;
            System.out.println(teacher.name);
        }
        if (t instanceof Person){
            System.out.println("����Person");
        }
        if (t instanceof Student){
            System.out.println("����Student");
        }
        if (t instanceof Study){
            System.out.println("����Study");
        }
        /*
        ���ӿ��븸��ͬʱ���ڷ���ʱ
        �Ը���Ϊ׼ ����
         */
    }
}
