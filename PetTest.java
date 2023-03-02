package aboutObject01.object01.day03;

import java.util.Scanner;

public class PetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetShop pet1=PetShop.getInstance();// 实例化
        System.out.print("请输入要领养宠物的名字:");
        pet1.setPetName(sc.nextLine());
        System.out.print("请选择要领养的宠物类型:(1.狗狗 2.企鹅)");
        pet1.setPetType(sc.nextInt()); // 选择宠物的类型
        pet1.setBreed(sc.nextInt());  // 选择品种
        System.out.print("请输入狗狗的健康值(1~100之间):");
        pet1.setHealth(sc.nextInt());
        System.out.println("宠物的自白:");
        System.out.println("我的名字叫"+pet1.getPetName()+",健康值是"+pet1.getHealth()
        +",和主人的亲密值是0"+",我是一只"+pet1.getBreed());
    }
}
