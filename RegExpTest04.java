package regularExpression.march12th;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest04 {
    /**
     * 验证电子邮件
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String content= sc.nextLine();
//        Pattern pattern = Pattern.compile("[\\w-]+@([A-Za-z]+\\.)+[a-zA-Z]+");
//        Matcher matcher = pattern.matcher(content);
//        if (matcher.find()){
//            System.out.println("验证成功");
//        }else {
//            System.out.println("验证失败");
//        }
        String regStr="^[\\w-]+@([A-Za-z]+\\.)+[a-zA-Z]+$";
        /**
         * 1.String 的 matches 是整体匹配
         */
        if (content.matches(regStr)){// 判斷
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
        sc.close();
    }
}
