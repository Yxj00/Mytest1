package regularExpression.march9th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegGrammar {
    /**
     * 演示转义字符的使用
     * java的正则表达式中两个\\ 代表其他语言中的一个
     * 检索特殊字符的时候，需要用到转义字符
     * 需要用到转义符号的字符有以下: .*+()$/\?[]^{}
     * .代表一个字符
     * +代表1到多个字符
     *
     * @param args
     */
    public static void main(String[] args) {
        String content="abc$(abc(123(";
        //匹配
        String regStr="\\(";// (使用会报错 得用转义字符 \\
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){//查找
            System.out.println(matcher.group(0));
        }

    }
}
