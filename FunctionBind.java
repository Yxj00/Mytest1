package aboutObject01.object02.march10th.methodReference;

public class FunctionBind {
    public void foo(){
        System.out.println("��Ա����");
    }
    public static void main(String[] args) {
        //1.��ʵ����Ա
        /**
         * ����::��Ա����
         * ��Ա������Ϊ��Ҫ���������ʹ��
         */
        FunctionBind functionBind = new FunctionBind();
        functionBind.foo();
        IFoo  iFoo= new IFoo(){

            @Override
            public void iFoo() {

            }
        };
        iFoo.iFoo();
        // �ڶ���
        IFoo iFoo1=functionBind::foo;
        iFoo1.iFoo();

        //2
        PersonFactor factor = new PersonFactor(){

            @Override
            public String createPerson() {
                return null;
            }
        };
        factor.createPerson();
        String s = new String();
        PersonFactor p1=String::new;
       factor.createPerson();

        /**
         * ��̬����
         * ����::������
         */
        //SumInteger sumInteger=(a,b)->a+b;
        SumInteger sumInteger= Integer::sum;
        System.out.println(sumInteger.sum(3,4));
    }
}
