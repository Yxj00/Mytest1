package aboutObject01.object01.marchEighth;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("�������û���:");
        String name = scan.next();
        int count = 0, count1 = 0;
        while (!checkName(name)) {
            count++;
            if (count == 3) {
                System.out.println("���Ժ����ԣ���");
                return;
            }
            System.out.println("�û���������" + (3 - count) + "�λ��ᣬ����������:");

            name = scan.next();
        }
        System.out.println("����������:");
        String passwd = scan.next();
        while (!checkPassWd(passwd)) {
            count1++;
            if (count1 == 3) {
                System.out.println("��¼ʧ�ܣ�");
                return;
            }
            System.out.println("����������" + (3 - count1) + "�λ��ᣬ����������:");

            passwd = scan.next();
        }
        System.out.println("��¼�ɹ���");
    }

    public static boolean checkName(String name) {
//        Pattern compile = Pattern.compile("[a-z]|[A-Z]", 3);
        String compile = "([a-z]|[A-Z]){3}";
        if (name.matches(compile)) {
            String upName = name.toUpperCase();
            if (upName.equals("TOM")) {
                System.out.println("�û�����ȷ");
                return true;
            }
        }
        return false;
    }

    public static boolean checkPassWd(String passwd) {

        String rex = "(\\d){6}";
        if (passwd.matches(rex)) {
            if (passwd.equals("123456")) {
                return true;
            }
        }
        return false;
    }
}
