package aboutObject01.object01.marchsixth;

public interface Grade extends Study{
    /*
    不仅具有自己的也具有父类的方法
    与继承的父类重名 就会覆盖父类
     */
    void study();
    void gradeNow();
}
