package aboutObject01.object02.march9th;

public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        StringBuffer s1= new StringBuffer("�ഺ�޻�");
        int num=110;

        // toString ת��ΪString
        System.out.println(s1.toString());
        StringBuffer s2 = s1.append("��������");
        System.out.println(s2);
        StringBuffer s3 = s2.append(num);
        System.out.println(s3.insert(4,","));
    }
}
