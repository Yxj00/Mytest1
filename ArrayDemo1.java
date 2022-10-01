package com.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
//        数据类型[] 变量名=new 数据类型[数组长度];
// 数组静态初始化       数据类型[] 数组名=new 数据类型[]{元素1,元素2...};
//        简化格式 数组类型[] 数组名={};
    int[] arr={9,56,23,12,0,3,7};
    int i,j,t,k;
    for (i=0;i<7;i++){
        for (j=0;j<7;j++){
            if(arr[i]<arr[j]){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
    }
    for (k=0;k<7;k++){
        System.out.print(arr[k]+"\t");
    }
    }
}
