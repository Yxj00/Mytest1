package com.duixiang.day04;


public class ContantTest {
    public static void main(String[] args) {
//        Constant c= new Constant();//加了static就不需要new
//        if(Constant.CODE==200){//加类名就可以调用
//           System.out.println("传导成功");
//       }
        int code=500;
        //http状态码
        if (Constant.CODE_200 == code) {
            System.out.println("成功");
            return;
        }
        if (Constant.CODE_404 == code) {
            System.out.println("找不到");
            return;
        }
        if (Constant.CODE_500 == code) {
            System.out.println("错误");
        }
    }
}
