package com.duixiang.day18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * �Ż�Work02����
 */
public class Work002 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        //1.����5��ѧ������
        for (int i = 1; i <=3 ; i++) {
            Scanner sc = new Scanner(System.in);//���д��forѭ������  ��Ҫд������
            System.out.println("��"+i+"��ѧ������");
            String usrName= sc.nextLine();
            System.out.println("��"+i+"��ѧ������");
            int age = sc.nextInt();
            students.add(new Student(usrName,age));//���뼯��
            System.out.println("--------------");
        }
        System.out.println("¼��ɹ�����ʼ��ѯѧ����Ϣ��");
        //2.���������
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("����:"+student.getUsername()+" ����:"+student.getAge());

        }
    }
}
