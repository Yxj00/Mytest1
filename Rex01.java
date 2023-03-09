package aboutObject01.object01.marchEighth;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = scan.next();
        int count = 0, count1 = 0;
        while (!checkName(name)) {
            count++;
            if (count == 3) {
                System.out.println("请稍后再试！！");
                return;
            }
            System.out.println("用户名有误还有" + (3 - count) + "次机会，请重新输入:");

            name = scan.next();
        }
        System.out.println("请输入密码:");
        String passwd = scan.next();
        while (!checkPassWd(passwd)) {
            count1++;
            if (count1 == 3) {
                System.out.println("登录失败！");
                return;
            }
            System.out.println("密码有误还有" + (3 - count1) + "次机会，请重新输入:");

            passwd = scan.next();
        }
        System.out.println("登录成功！");
    }

    public static boolean checkName(String name) {
//        Pattern compile = Pattern.compile("[a-z]|[A-Z]", 3);
        String compile = "([a-z]|[A-Z]){3}";
        if (name.matches(compile)) {
            String upName = name.toUpperCase();
            if (upName.equals("TOM")) {
                System.out.println("用户名正确");
                return true;
            }
        }
        return false;
    }

    public static boolean checkPassWd(String passwd) {

        String rex = "(\\d){6}";
        if (passwd.matches(rex)) {
            if (passwd.equals("123456")) {
                return true;
            }
        }
        return false;
    }
}
