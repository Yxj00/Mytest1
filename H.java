package Tjise.daxue;
import java.lang.String;
public class H {
    String color;
    int speed;
    int seat;
    public void run(){
        System.out.println("车能跑");
    }
    public static void main(String[] args) {
        H c=new H();
        c.run();
        c.color="red";
        c.speed=100;
        c.seat=4;
        System.out.println("车为"+c.color);
        System.out.println("座椅为"+c.seat);
        System.out.println("车的速度为"+c.speed);
    }
}
