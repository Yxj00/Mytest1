package com.duixiang.day04;


public class ContantTest {
    public static void main(String[] args) {
//        Constant c= new Constant();//����static�Ͳ���Ҫnew
//        if(Constant.CODE==200){//�������Ϳ��Ե���
//           System.out.println("�����ɹ�");
//       }
        int code=500;
        //http״̬��
        if (Constant.CODE_200 == code) {
            System.out.println("�ɹ�");
            return;
        }
        if (Constant.CODE_404 == code) {
            System.out.println("�Ҳ���");
            return;
        }
        if (Constant.CODE_500 == code) {
            System.out.println("����");
        }
    }
}
