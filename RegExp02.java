package regularExpression.march9th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp02 {
    public static void main(String[] args) {
        String content="a1111111aaaaa";
        /**
         * 细节；java匹配默认贪婪匹配，即尽可能匹配多的
         */
//        String regStr="a{3,4}";
//        String regStr="1+";// 匹配一个1或者多个1
//        String regStr="1*";匹配0到多个1
        String regStr="a1?";//匹配a或者a1    0-1
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
