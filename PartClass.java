package aboutObject01.object02.march9th;

public class PartClass {
    // 局部内部类 方法里面定义的
    private  String name="初始化";
    public  void partMethod(){
        class InnerClass{
            public void partInnerMethod(){
                System.out.println(name);
            }
        }
        /**
         * 使用它 必须要创建对象
         * 既然在方法中声明的类，作用范围也就只能在方法中
         */
        InnerClass ic = new InnerClass();
        ic.partInnerMethod();
    }
}
