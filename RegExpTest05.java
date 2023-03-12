package regularExpression.march12th;

import java.util.Scanner;

/**
 * 验证是不是整数或者小数
 * 要考虑正数和负数\
 * 逐步完善
 */
public class RegExpTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String content= sc.nextLine();
        String regStr="^[+]?[1-9](\\d+)$";
        String regStr1="-(\\d+)$";
        String regStr2="^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";
        if (content.matches(regStr)){
            System.out.println("是正数");
        }else if (content.matches(regStr1)){
            System.out.println("是负数");
        }else if (content.matches(regStr2)){
            System.out.println("是小数");
        }
    }
}
