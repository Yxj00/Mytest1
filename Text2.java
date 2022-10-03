package Tjise.daxue;

public class Text2 {
    /**
     * 方法的重载
     * 在同一类 不允许存在方法名称和参数列表都是相同
     * 方法的名称相同 但是方法的参数类型不同 是可以的
     * */
    public static void main(String[] args) {

    }
    public static int sum(int a,int b){
        return a+b;
    }
    //要在同一类中 名称相同，但是参数类型不同--重载
    //方法的重载与方法的返回类型无关，不能够通过方法的方法类型判断
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
