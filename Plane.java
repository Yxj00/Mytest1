package aboutObject01.object01.marchEighth;
import java.util.Scanner;
public class Plane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�������Ʊԭ��:");
        double ticket = sc.nextDouble();
        System.out.println("�����빺Ʊ�·�:");
        int month = sc.nextInt();
        System.out.println("������ͷ�Ȳջ򾭼ò�:");
        String s = sc.next();
        if (month >= 5 && month <= 10) {
            if (s.equals("ͷ�Ȳ�")) {
                ticket = ticket * 0.9;
            } else if (s.equals("���ò�")) {
                ticket = ticket * 0.85;
            }
        } else {
            if (s.equals("ͷ�Ȳ�")) {
                ticket = ticket * 0.7;
            } else if (s.equals("���ò�")) {
                ticket = ticket * 0.65;
            }
        }
        System.out.println("��������Ʊ��Ϊ:" + (int) ticket);}
}
