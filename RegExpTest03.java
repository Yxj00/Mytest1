package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest03 {
    public static void main(String[] args) {
        String content="jhdgk hello jahdkknbhd hello";
        //������content��hello�滻�� ��˳ƽ����
        String regStr="hello";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        String s = matcher.replaceAll("��˳ƽ����");
        System.out.println(s);
        System.out.println(content);
    }
}
