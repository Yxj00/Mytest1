package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ��������
 */
public class RegExp05 {
    public static void main(String[] args) {
        String content="andkjh11 1221  22 66666  6666 77777 20222202 12321-333999111";
        // ƥ��������������ͬ����
//        String regStr="(\\d)\\1";// \\1��ʾ�������1��ͬ
        // ƥ�������������ͬ����:(\\d)\\1{4}
//        String regStr="(\\d)\\1{4}";
//        String regStr="(\\d)(\\d)\\2\\1";����
//        String regStr="(\\d)(\\d)(\\d)(\\d)\\4\\3\\2\\1";
        /**
         * �ַ����м�����Ʒ��ţ���ʽ�磺12321-333999111
         * Ҫ������ǰ����һ����λ����Ȼ��һ��-�ţ�Ȼ����һ����λ����������ÿ��λҪ��ͬ
         */
        String regStr="\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
