package com.duixiang.day22;

import java.util.Scanner;

public class YangHuiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需显示的行数:");
        int N=sc.nextInt();
        int[][] arr = new int[N+1][N+1];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= i; j++) {
                if (j==1||j==i){
                    arr[i][j]=1;
                    System.out.print(arr[i][j]+" ");
                    continue;
                }
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
