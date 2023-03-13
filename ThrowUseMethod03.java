package aboutObject01.aboutException.march13th;

public class ThrowUseMethod03 {
    public static void main(String[] args) {
        //1.运行时异常
        System.out.println("开始");
        test(1,0);
        try {
            test1(1,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //方法
    public static int test(int a,int b){
        if (b==0)
            throw new RuntimeException("除数不能为0");
        return a/b;
    }
    public static int test1(int a,int b)throws Exception{
        if (b==0)
            throw new Exception("除数不能为0");
        return a/b;
    }
}
