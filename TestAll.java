package aboutObject01.object02.march10th;

public class TestAll {
    public static void main(String[] args) {
        Person person = new Person("lili"){
            /**
             * �ֲ��ڲ���ļ򻯰�
             * new �����{}
             */
            @Override
            public void method() {
                super.method();
                System.out.println("����ʵ��");
                test();
            }
            public void test(){
                System.out.println("test");
            }
        };
       person.method();

       //�ӿ�
        Inner i = new Inner() {
            @Override
            public void innerMethod() {
                System.out.println("innerMethod");
            }

        };
        i.innerMethod();
        i.test();
    }
}
