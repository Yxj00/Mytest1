package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest03 {
    public static void main(String[] args) {
        String content="jhdgk hello jahdkknbhd hello";
        //完成如果content有hello替换成 韩顺平教育
        String regStr="hello";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        String s = matcher.replaceAll("韩顺平教育");
        System.out.println(s);
        System.out.println(content);
    }
}
