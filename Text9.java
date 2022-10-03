package Tjise.daxue;
import java.util.Scanner;
public class Text9 {
    /**
     * 逢7过，
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("请随机输入一个1-100之间的数:");
      int num= sc.nextInt();
      for (;num<=100;num++){
          if (num%10==7||num/10%10==7||num%7==0){
              System.out.println(num+"有7过");
          }
      }
    }
}
