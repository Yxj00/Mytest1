package regularExpression.march9th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp01 {
    /**
     * ��ʾ�ַ�ƥ�����ʹ��
     */
    public static void main(String[] args) {
        String content="a11c8   abc_ABC";
//        String regStr="[a-z]";// ƥ��a-z֮������һ���ַ�
//        String regStr="[A-Z]";// ƥ��A-Z֮������һ���ַ�
//          String regStr="abc"; // ƥ��abc �ַ���[Ĭ�����ִ�Сд]
//          String regStr="[abc]"; // ƥ����abc������һ���ַ�[a-d]
//        String regStr="(?i)abc";
        /** (?i)abcƥ��abc�ַ��������ִ�Сд
         * a(?i)bc ƥ��bc�����ִ�Сд
         * a((?i)b)c ƥ��ɲ����ִ�Сд
         */
//        String regStr="[^a-zA-Z0-9]";// ƥ�䲻��a-zA-Z0-9�е�����һ���ַ�
//        String regStr="\\D"; // ƥ��������ַ�������һ���ַ�
//        String regStr="\\w";// ƥ���Сд��ĸ�����֣��»��� �൱��
//        String regStr="\\W";// ��Сд��w�෴
//        String regStr="\\s";// ƥ���κοհ��ַ�(�ո��Ʊ����)
        String regStr="\\S";// ��Сдs�����෴
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("�ҵ�:"+matcher.group(0));
        }
    }

}
