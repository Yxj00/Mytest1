package Tjise.LangQiao.march9th;

import java.util.Scanner;

/**
 * ����������
 */
public class Main {
    public static int[] getX={0,1,0,-1};
    public static int[] getY={1,0,-1,0};
    public static int cnt=0;
    public static void dfs(int[][] h,int x,int y,int n,int m,int l){
        for (int i = 0; i < 4; i++) {
            int newx=x+getX[i];
            int newy=y+getY[i];
            if (newx>=0&&newx<n&&newy>=0&&newy<m&&h[newx][newy]<h[x][y]){
                l++;
                cnt=Math.max(cnt,l);
                dfs(h,newx,newy,n,m,l);
                l--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] h = new int[n][m];// ���뼸�м���
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                h[i][j]= sc.nextInt();// ��������
            }
        }
        int res=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cnt=0;
                dfs(h,i,j,n,m,1);
                res=Math.max(res,cnt);
            }
        }
        System.out.println(res);
    }
}
