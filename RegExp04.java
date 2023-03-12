package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp04 {
    /**
     * 演示非捕获分组，语法比较奇怪
     * 使用非捕获分组 不能使用matcher.group(1);
     * @param args
     */
    public static void main(String[] args) {
        String content="hello韩顺平教育 Jack韩顺平老师 韩顺平同学hello";
        //找到 韩顺平教育 韩顺平老师 韩顺平同学字符串
//        String regStr="韩顺平(?:教育|老师|同学)";等价于"韩顺平教育|韩顺平老师|韩顺平同学"
        //只查找韩顺平教育和老师中包含的韩顺平
//        String regStr="韩顺平(?=教育|老师)";
        //找韩顺平关键字 查找不是（韩顺平教育和韩顺平老师）中包含的韩顺平
        String regStr="韩顺平(?!教育|老师)";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
