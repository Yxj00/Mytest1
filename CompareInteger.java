package aboutObject01.object01.marchSeventh;

public class CompareInteger {
    public static void main(String[] args) {
        // 1.�ֶ�װ��
        // ��װ����һ���࣬���ǻ�������
//        Integer x = new Integer(10);
//        Integer y = new Integer(10);

//        System.out.println(x==y);// false


        // 2.valueOf
        Integer x1 = Integer.valueOf(10);
        Integer y1 = Integer.valueOf(10);
        System.out.println(x1==y1);// true
        // 3.�Զ�װ��
        Integer a=10,b=10;

        System.out.println(a==b);// true
        System.out.println(x1==b);// true

        // ���� ��Ϊ�����˻��淶Χ �����
        Integer i=128,j=128;
        System.out.println(i==j);// false
        // IntegerCache�Ỻ��-128~127֮�������ֵ
        //
        System.out.println("---------------------------");
//        System.out.println(x.equals(y));
        System.out.println(x1.equals(y1));
        System.out.println(a.equals(b));
        System.out.println(x1.equals(b));
        System.out.println(i.equals(j));

    }
}
