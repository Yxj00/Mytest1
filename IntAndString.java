package aboutObject01.object01.marchSeventh;

public class IntAndString {
    public static void main(String[] args) {
        /**
         * Int �� string �໥ת��
         */
        // ��ʽһ
        int i=10;
        String i1=i+"";
        //��ʽ��
        String s = String.valueOf(i);
        // string -->int
        String x="400";
        // ��ʽһ
        Integer x1 = Integer.valueOf(x);
        int x2= x1.intValue();
        // ��ʽ�� parseInt
        int i2 = Integer.parseInt(x);

    }
}
