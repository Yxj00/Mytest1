package aboutObject01.aboutException.march13th;

/**
 * 断言表达式
 */
public class Assertion04 {
   static  {
        System.out.println(Math.sin(Math.PI/2));
    }
    public static void main(String[] args) {
        int s=1;
        assert  s>10:"s不大于10";
    }
    private static void test(int i){
        assert i!=1:"输入的值不能为1";
        System.out.println(i);
    }
}
