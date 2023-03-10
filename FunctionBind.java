package aboutObject01.object02.march10th.methodReference;

public class FunctionBind {
    public void foo(){
        System.out.println("成员方法");
    }
    public static void main(String[] args) {
        //1.绑定实例成员
        /**
         * 对象::成员方法
         * 成员方法因为需要具体对象来使用
         */
        FunctionBind functionBind = new FunctionBind();
        functionBind.foo();
        IFoo  iFoo= new IFoo(){

            @Override
            public void iFoo() {

            }
        };
        iFoo.iFoo();
        // 第二种
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
         * 静态方法
         * 类名::方法名
         */
        //SumInteger sumInteger=(a,b)->a+b;
        SumInteger sumInteger= Integer::sum;
        System.out.println(sumInteger.sum(3,4));
    }
}
