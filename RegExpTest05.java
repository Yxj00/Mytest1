package regularExpression.march12th;

import java.util.Scanner;

/**
 * ��֤�ǲ�����������С��
 * Ҫ���������͸���\
 * ������
 */
public class RegExpTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String content= sc.nextLine();
        String regStr="^[+]?[1-9](\\d+)$";
        String regStr1="-(\\d+)$";
        String regStr2="^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";
        if (content.matches(regStr)){
            System.out.println("������");
        }else if (content.matches(regStr1)){
            System.out.println("�Ǹ���");
        }else if (content.matches(regStr2)){
            System.out.println("��С��");
        }
    }
}
