package aboutObject01.object02.march10th;

public class TestAll {
    public static void main(String[] args) {
        Person person = new Person("lili"){
            /**
             * 局部内部类的简化版
             * new 后面加{}
             */
            @Override
            public void method() {
                super.method();
                System.out.println("匿名实现");
                test();
            }
            public void test(){
                System.out.println("test");
            }
        };
       person.method();

       //接口
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
