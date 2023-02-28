package aboutObject01.object01.day01;

import java.util.Scanner;

public class Test01 {
    static int sum=0;
   static int test(int n){
        sum+=n--;
        if (n==0){
            return sum;
        }
        return test(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(test(n));
    }
}
