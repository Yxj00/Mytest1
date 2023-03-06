package aboutObject01.object01.marchsixth;

public class Teacher extends Person implements Grade{
    public String name="小黑";
    @Override
    public void study() {
        System.out.println("我是老师");
    }

    @Override
    public void gradeNow() {

    }
}
