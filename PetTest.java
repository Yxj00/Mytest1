package aboutObject01.object01.day03;

import java.util.Scanner;

public class PetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PetShop pet1=PetShop.getInstance();// ʵ����
        System.out.print("������Ҫ�������������:");
        pet1.setPetName(sc.nextLine());
        System.out.print("��ѡ��Ҫ�����ĳ�������:(1.���� 2.���)");
        pet1.setPetType(sc.nextInt()); // ѡ����������
        pet1.setBreed(sc.nextInt());  // ѡ��Ʒ��
        System.out.print("�����빷���Ľ���ֵ(1~100֮��):");
        pet1.setHealth(sc.nextInt());
        System.out.println("������԰�:");
        System.out.println("�ҵ����ֽ�"+pet1.getPetName()+",����ֵ��"+pet1.getHealth()
        +",�����˵�����ֵ��0"+",����һֻ"+pet1.getBreed());
    }
}
