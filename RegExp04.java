package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp04 {
    /**
     * ��ʾ�ǲ�����飬�﷨�Ƚ����
     * ʹ�÷ǲ������ ����ʹ��matcher.group(1);
     * @param args
     */
    public static void main(String[] args) {
        String content="hello��˳ƽ���� Jack��˳ƽ��ʦ ��˳ƽͬѧhello";
        //�ҵ� ��˳ƽ���� ��˳ƽ��ʦ ��˳ƽͬѧ�ַ���
//        String regStr="��˳ƽ(?:����|��ʦ|ͬѧ)";�ȼ���"��˳ƽ����|��˳ƽ��ʦ|��˳ƽͬѧ"
        //ֻ���Һ�˳ƽ��������ʦ�а����ĺ�˳ƽ
//        String regStr="��˳ƽ(?=����|��ʦ)";
        //�Һ�˳ƽ�ؼ��� ���Ҳ��ǣ���˳ƽ�����ͺ�˳ƽ��ʦ���а����ĺ�˳ƽ
        String regStr="��˳ƽ(?!����|��ʦ)";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
