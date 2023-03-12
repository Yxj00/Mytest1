package regularExpression.march12th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示正则表达式的使用
 * 验证URL
 */
public class RegExpTest02 {
    public static void main(String[] args) {
//        String content="https://www.bilibili.com/video/BV1VT411e7BP/?spm_id_from=333.1007.tianma.7-1-23.click";
        String content="http://cg.hmedustudy.com/yg/bilibili/nf5563/pc/qg/05-2/index.html#27?track_id=pbaes.aUKcfic5HIQIMsa-BtiQ0ahk22hJw9xmFEUDX8_G8EOYRRpq7RJMbWhe1vOw1oHvVjOSo-9ArJWlB5t-wR4uodSLLcKA965cli0wlGvvxWuctbIcg83LTtSgpp6DlcE4wdiiukNeJ8x7DBifySoy0uw3K4JiYVrnRGg-SplGrjag7DhtTbB94Rj5-XJXJxtC";
        /**
         *
         * 思路
         * 1.先确定URl的开始部分 https:// | http://
         * 2.然后通过([\w-]+\.)+[\w-]匹配www.bilibili.com
         */
        String regStr="^((https?)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        if (matcher.find()){
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
    }
}
