package regularExpression.march9th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp02 {
    public static void main(String[] args) {
        String content="a1111111aaaaa";
        /**
         * ϸ�ڣ�javaƥ��Ĭ��̰��ƥ�䣬��������ƥ����
         */
//        String regStr="a{3,4}";
//        String regStr="1+";// ƥ��һ��1���߶��1
//        String regStr="1*";ƥ��0�����1
        String regStr="a1?";//ƥ��a����a1    0-1
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
