package aboutObject01.object01.marchEighth;

import java.util.Scanner;

public class Ex01 {
    /** ע��ɹ��� ��ʵ�ֵ�¼��֤���û���Ϊ"TOM",����Ϊ��123456��
     * ��¼ʱ�������û����Ĵ�Сд���⣬ʵ�ֵ�¼
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������û���:");
        String userName=sc.nextLine();
        System.out.println("����������:");
        Integer passwd=sc.nextInt();
       if (yanUser(userName))
        yanPassWd(passwd);

    }
    public static boolean yanUser(String name){
            String lowName=name.toLowerCase();
            String upName=name.toUpperCase();
            char[] c=lowName.toCharArray();
            char[] c1=upName.toCharArray();
            if ((c[0]=='t'||c1[0]=='T')&&(c[1]=='o'||c[1]=='O')&&(c[2]=='m'||c[2]=='M')){
                return true;
            }else {
                System.out.println("�û�������");
            }
        return false;
    }
    public static boolean yanPassWd(Integer passwd){
        if (passwd.equals(123456)){
            System.out.println("��¼�ɹ���");
            return true;
        }else {
            System.out.println("�������!");
        }
        return false;
    }
}
