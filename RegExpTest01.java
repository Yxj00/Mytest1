package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ������ʽ��Ӧ��ʵ��
 */
public class RegExpTest01 {
    public static void main(String[] args) {
//        String content="��˳ƽ����";
        /**
         * 1.��֤�Ƿ�ͷ����β�Ƿ��Ǻ���
         */
//        String regStr="^[\u0391-\uffe5]$";
        /**
         * 2.��������
         * Ҫ��:1-9��ͷ��һ����λ����
         */
//        String content="123560";
//        String regStr="^[1-9]\\d{5}$";
        /**
         * 3.qq����
         * Ҫ��: 1-9��ͷ��һ��(5-10)λ����
         */
//        String content="122345";
//        String regStr="^[1-9]\\d{4,9}$";
        /**
         * �ֻ�����
         * Ҫ��:������13,14,15��18��ͷ��11λ��
         */
        String content="13234578695";
        String regStr="^1(?:3|4|5|8)\\d{9}$";//����^1[3|4|5|8]\\d{9}
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()){
            System.out.println("�����ʽ");
        }else {
            System.out.println("�������ʽ");
        }
    }
}
