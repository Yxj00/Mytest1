package aboutObject01.object01.day01;

import java.util.Scanner;

public class Test02 {
   static int test(int n){

        if (n==1){
            return 1;
        }
        else {
            return n+test(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(test(n));
    }
}
