package aboutObject01.object01.marchSeventh;

import com.duixiang.day06.I;

public class InitialArray01 {
    public static void main(String[] args) {
        /** 数组初始化
         动态初始化数组
         1.类型[] 变量名称 =new 类型[数组大小]
         2. new 是为数组申请内存空间
         静态初始化数组
         1.类型[] 变量名称 =new 类型[]{...};
         2.类型[] 变量名称={...};简化操作
         */
        int[] a = new int[5];
        String[] s = new String[]{"ETC","JAVA"};
        /**
         * 修改数组元素会影响内存空间
         *
         */
        System.out.println(a);
        a[0]=1;
        a[1]=2;
        System.out.println(a);
        System.out.println("----------------");
        System.out.println(s);
        s[1]="您好";
        System.out.println(s);
        /**
         * 将一个数组赋值给另一个数组
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
