package aboutObject01.object01.marchEighth;

import java.util.Scanner;

public class Ex01 {
    /** 注册成功后 ，实现登录验证，用户名为"TOM",密码为“123456”
     * 登录时不考虑用户名的大小写问题，实现登录
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName=sc.nextLine();
        System.out.println("请输入密码:");
        Integer passwd=sc.nextInt();
       if (yanUser(userName))
        yanPassWd(passwd);

    }
    public static boolean yanUser(String name){
            String lowName=name.toLowerCase();
            String upName=name.toUpperCase();
            char[] c=lowName.toCharArray();
            char[] c1=upName.toCharArray();
            if ((c[0]=='t'||c1[0]=='T')&&(c[1]=='o'||c[1]=='O')&&(c[2]=='m'||c[2]=='M')){
                return true;
            }else {
                System.out.println("用户名错误");
            }
        return false;
    }
    public static boolean yanPassWd(Integer passwd){
        if (passwd.equals(123456)){
            System.out.println("登录成功！");
            return true;
        }else {
            System.out.println("密码错误!");
        }
        return false;
    }
}
