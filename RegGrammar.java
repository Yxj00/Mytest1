package regularExpression.march9th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegGrammar {
    /**
     * ��ʾת���ַ���ʹ��
     * java��������ʽ������\\ �������������е�һ��
     * ���������ַ���ʱ����Ҫ�õ�ת���ַ�
     * ��Ҫ�õ�ת����ŵ��ַ�������: .*+()$/\?[]^{}
     * .����һ���ַ�
     * +����1������ַ�
     *
     * @param args
     */
    public static void main(String[] args) {
        String content="abc$(abc(123(";
        //ƥ��
        String regStr="\\(";// (ʹ�ûᱨ�� ����ת���ַ� \\
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){//����
            System.out.println(matcher.group(0));
        }

    }
}
