package Tjise.daxue;

/**
 * 方法的参数传递引用类型
 */
public class Text4 {
    public static void main(String[] args) {
        int[] arr={30,60,90};
        System.out.println("调用change方法前:"+arr[0]);
        change(arr);//地址传递，双向的 
        System.out.println("调用change方法后:"+arr[0]);
    }
    public static void change(int[] arr){
        arr[0]=100;
    }
}
