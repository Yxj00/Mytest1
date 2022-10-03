package Tjise.daxue;
import java.util.Scanner;
public class Text1 {
    public static boolean isnumber(int isnumber){//定义一个方法
        if(isnumber%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);//输入数
        System.out.println("请输入一个数:");
        int  number= num.nextInt();
        boolean result=isnumber(number);//使用方法
        System.out.println(result?"偶数":"奇数");//三目运算
    }
}
