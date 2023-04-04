package Tjise.LangQiao.April3th;

import java.util.Scanner;

public class Yanghui {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        long n=scan.nextInt();
        long count=0;
        long[][] arr=new long[100010][100010];
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    arr[i][j]=1L;
                    count++;
                    if(n==arr[i][j]){
                        System.out.println(count);
                        return;
                    }
                    continue;
                }
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                count++;
                if(n==arr[i][j]){
                    System.out.println(count);
                    return;
                }
            }

        }
        scan.close();
    }
}
