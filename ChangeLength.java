package aboutObject01.object01.marchEighth;

public class ChangeLength {
    public void test(String...strings){
        System.out.println(strings);
        // strings ����������һ��string[]����
        for(String s:strings){
            System.out.println(s);
        }
    }
    /**
     * ͬʱ���ڶ������
     * �ɱ䳤�������������
     * @param a
     * @param b
     * @param strings
     */
    public void test1(int a,int b,String...strings){

    }

    public static void main(String[] args) {
        ChangeLength c1 = new ChangeLength();
        c1.test("��Ƴ�","��Ƴ�2��","��Ƴ�3��");
        c1.test1(1,2,"��Ƴ�","��Ƴ�2��","��Ƴ�3��");
        //args�����в���
        for (String arg:args){
            System.out.println(arg);
        }
    }
}
