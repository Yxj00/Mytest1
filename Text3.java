package Tjise.daxue;

public class Text3 {
    /**
     * 方法的参数类型传递的基本类型
     *
     * 形参的改变不会影响到实参
     * @param args
     */
    public static void main(String[] args) {
        int num=10;
        System.out.println("调用方法前的值"+num);
        change(num);
        System.out.println("调用方法后的值"+num);

    }
    public static void change(int num){
        num=20;

        System.out.println("change中num发生改变后的值"+num);
    }
}
