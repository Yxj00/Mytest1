package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 反向引用
 */
public class RegExp05 {
    public static void main(String[] args) {
        String content="andkjh11 1221  22 66666  6666 77777 20222202 12321-333999111";
        // 匹配两个连续的相同数字
//        String regStr="(\\d)\\1";// \\1表示是与分组1相同
        // 匹配五个连续的相同数字:(\\d)\\1{4}
//        String regStr="(\\d)\\1{4}";
//        String regStr="(\\d)(\\d)\\2\\1";回文
//        String regStr="(\\d)(\\d)(\\d)(\\d)\\4\\3\\2\\1";
        /**
         * 字符串中检索商品编号：形式如：12321-333999111
         * 要求满足前面是一个五位数，然后一个-号，然后是一个九位数，连续的每三位要相同
         */
        String regStr="\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
