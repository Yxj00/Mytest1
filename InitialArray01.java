package aboutObject01.object01.marchSeventh;

import com.duixiang.day06.I;

public class InitialArray01 {
    public static void main(String[] args) {
        /** �����ʼ��
         ��̬��ʼ������
         1.����[] �������� =new ����[�����С]
         2. new ��Ϊ���������ڴ�ռ�
         ��̬��ʼ������
         1.����[] �������� =new ����[]{...};
         2.����[] ��������={...};�򻯲���
         */
        int[] a = new int[5];
        String[] s = new String[]{"ETC","JAVA"};
        /**
         * �޸�����Ԫ�ػ�Ӱ���ڴ�ռ�
         *
         */
        System.out.println(a);
        a[0]=1;
        a[1]=2;
        System.out.println(a);
        System.out.println("----------------");
        System.out.println(s);
        s[1]="����";
        System.out.println(s);
        /**
         * ��һ�����鸳ֵ����һ������
         *
         */
        int[] a1=a;
        a1[0]=0;
        a1[1]=1;
        a[2]=2;
        System.out.println(a);//[I@16b98e56
        System.out.println(a1);

        System.out.println(a[0]);// 0
        System.out.println(a1[0]);
        System.out.println(a[1]);// 1
        System.out.println(a1[1]);
        System.out.println(a[2]);// 2
        System.out.println(a1[2]);
    }
}
