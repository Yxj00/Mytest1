package Tjise.daxue;

/**
 * idea分析栈帧链
 * 栈，先进后出，后进先出
 * 压栈----先执行A方法。。。执行方法
 * 出栈----
 * 栈帧就是我们的方法
 */
public class Text7 {
    public static void a(){
        System.out.println("a");
        b();
    }
    public static void b(){
        System.out.println("b");
        c();
    }
    public static void c(){
        System.out.println("c");
    }
    public static void main(String[] args) {
        a();
    }
}
