package regularExpression.march12th;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest04 {
    /**
     * ��֤�����ʼ�
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String content= sc.nextLine();
//        Pattern pattern = Pattern.compile("[\\w-]+@([A-Za-z]+\\.)+[a-zA-Z]+");
//        Matcher matcher = pattern.matcher(content);
//        if (matcher.find()){
//            System.out.println("��֤�ɹ�");
//        }else {
//            System.out.println("��֤ʧ��");
//        }
        String regStr="^[\\w-]+@([A-Za-z]+\\.)+[a-zA-Z]+$";
        /**
         * 1.String �� matches ������ƥ��
         */
        if (content.matches(regStr)){// �Д�
            System.out.println("ƥ��ɹ�");
        }else {
            System.out.println("ƥ��ʧ��");
        }
        sc.close();
    }
}
