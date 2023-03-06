package aboutObject01.object01.marchsixth;

public class Student extends Person implements Study,A{
   public String name="lili";// 不能被访问
    @Override
    public void study() {
        System.out.println("我是学生");
    }

    @Override
    public void aboutA() {
        System.out.println("我有A能力");
    }
}
