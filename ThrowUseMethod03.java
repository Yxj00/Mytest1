package aboutObject01.aboutException.march13th;

public class ThrowUseMethod03 {
    public static void main(String[] args) {
        //1.����ʱ�쳣
        System.out.println("��ʼ");
        test(1,0);
        try {
            test1(1,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //����
    public static int test(int a,int b){
        if (b==0)
            throw new RuntimeException("��������Ϊ0");
        return a/b;
    }
    public static int test1(int a,int b)throws Exception{
        if (b==0)
            throw new Exception("��������Ϊ0");
        return a/b;
    }
}
