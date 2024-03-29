package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的应用实例
 */
public class RegExpTest01 {
    public static void main(String[] args) {
//        String content="韩顺平教育";
        /**
         * 1.验证是否开头到结尾是否都是汉字
         */
//        String regStr="^[\u0391-\uffe5]$";
        /**
         * 2.邮政编码
         * 要求:1-9开头的一个六位数。
         */
//        String content="123560";
//        String regStr="^[1-9]\\d{5}$";
        /**
         * 3.qq号码
         * 要求: 1-9开头的一个(5-10)位数字
         */
//        String content="122345";
//        String regStr="^[1-9]\\d{4,9}$";
        /**
         * 手机号码
         * 要求:必须以13,14,15，18开头的11位数
         */
        String content="13234578695";
        String regStr="^1(?:3|4|5|8)\\d{9}$";//或者^1[3|4|5|8]\\d{9}
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()){
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
    }
}
