package aboutObject01.object01.marchEighth;
import java.util.Scanner;
public class Plane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入机票原价:");
        double ticket = sc.nextDouble();
        System.out.println("请输入购票月份:");
        int month = sc.nextInt();
        System.out.println("请输入头等舱或经济舱:");
        String s = sc.next();
        if (month >= 5 && month <= 10) {
            if (s.equals("头等舱")) {
                ticket = ticket * 0.9;
            } else if (s.equals("经济舱")) {
                ticket = ticket * 0.85;
            }
        } else {
            if (s.equals("头等舱")) {
                ticket = ticket * 0.7;
            } else if (s.equals("经济舱")) {
                ticket = ticket * 0.65;
            }
        }
        System.out.println("您的最终票价为:" + (int) ticket);}
}
