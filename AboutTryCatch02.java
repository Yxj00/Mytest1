package aboutObject01.aboutException.march13th;

public class AboutTryCatch02 {
    public static void main(String[] args) {
        int x=100,y=0;
        try {
            //1.异常
            System.out.println(x/y);
            System.out.println("计算结束");
        }catch (ArithmeticException e){
            //匹配成功
            System.out.println(e.getMessage());/// by zero
            System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
            e.printStackTrace();
            System.out.println("发生了数学异常");
        }finally {
            System.out.println("都要执行");
        }
        //匹配成功了程序继续运行
        //匹配失败了，不会打印这句话
        System.out.println("main方法运行结束");
    }
}
