package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 结巴程序
 */
public class RegExp06 {
    public static void main(String[] args) {
        String  content="我....我要.....学学学学....编程java！";
        //首先去掉所有的.
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content= matcher.replaceAll("");
        System.out.println(content);
        //2.去掉重复的字
        //思路   （1）使用(.)\\1
        // (2)使用 反向引用$1 来替换匹配到的内容
        //注意:因为正则表达式变化，所有需要重置matcher
//        pattern=Pattern.compile("(.)\\1+");
//        matcher= pattern.matcher(content);
//        while (matcher.find()){
//            System.out.println("找到重复数字:"+matcher.group(0));
//        }
//        System.out.println( matcher.replaceAll("$1"));
        System.out.println("===========================");

        /**
         * 使用一条语句 去掉重复的字
         */
        content= Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println(content);
    }
}
