package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ��ͳ���
 */
public class RegExp06 {
    public static void main(String[] args) {
        String  content="��....��Ҫ.....ѧѧѧѧ....���java��";
        //����ȥ�����е�.
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content= matcher.replaceAll("");
        System.out.println(content);
        //2.ȥ���ظ�����
        //˼·   ��1��ʹ��(.)\\1
        // (2)ʹ�� ��������$1 ���滻ƥ�䵽������
        //ע��:��Ϊ������ʽ�仯��������Ҫ����matcher
//        pattern=Pattern.compile("(.)\\1+");
//        matcher= pattern.matcher(content);
//        while (matcher.find()){
//            System.out.println("�ҵ��ظ�����:"+matcher.group(0));
//        }
//        System.out.println( matcher.replaceAll("$1"));
        System.out.println("===========================");

        /**
         * ʹ��һ����� ȥ���ظ�����
         */
        content= Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println(content);
    }
}
