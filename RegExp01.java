package regularExpression.march9th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp01 {
    /**
     * 演示字符匹配符的使用
     */
    public static void main(String[] args) {
        String content="a11c8   abc_ABC";
//        String regStr="[a-z]";// 匹配a-z之间任意一个字符
//        String regStr="[A-Z]";// 匹配A-Z之间任意一个字符
//          String regStr="abc"; // 匹配abc 字符串[默认区分大小写]
//          String regStr="[abc]"; // 匹配在abc中任意一个字符[a-d]
//        String regStr="(?i)abc";
        /** (?i)abc匹配abc字符串不区分大小写
         * a(?i)bc 匹配bc不区分大小写
         * a((?i)b)c 匹配吧不区分大小写
         */
//        String regStr="[^a-zA-Z0-9]";// 匹配不是a-zA-Z0-9中的任意一个字符
//        String regStr="\\D"; // 匹配非数字字符的任意一个字符
//        String regStr="\\w";// 匹配大小写字母，数字，下划线 相当于
//        String regStr="\\W";// 与小写的w相反
//        String regStr="\\s";// 匹配任何空白字符(空格，制表符等)
        String regStr="\\S";// 与小写s功能相反
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到:"+matcher.group(0));
        }
    }

}
