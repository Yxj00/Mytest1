package aboutObject01.aboutException.march13th;

/**
 * ���Ա��ʽ
 */
public class Assertion04 {
   static  {
        System.out.println(Math.sin(Math.PI/2));
    }
    public static void main(String[] args) {
        int s=1;
        assert  s>10:"s������10";
    }
    private static void test(int i){
        assert i!=1:"�����ֵ����Ϊ1";
        System.out.println(i);
    }
}
