package com.duixiang.day05;

public class AnimalDemo {
    /**
     * ��̬�����ص�
     * ����׶�
     * ��Ա���� ����׶ο���� ִ��Ҳ�ǿ����
     * ��Ա���� ����׶��ǿ���� ִ�п��ұ�
     * @param args
     */
    public static void main(String[] args) {
        //���������ָ������ new����Ķ���
        Dog dog = new Dog();
        dog.eat();
        //�и��������ָ�����ǵ�������� ��̬
        AnimalParent animalParent=new Dog();
        animalParent.eat();
//        System.out.println(animalParent.wight);//����ԭ���Ǹ���û�ж���
        System.out.println(dog.weigh);
        System.out.println(dog.age);
        dog.show();

    }
}
