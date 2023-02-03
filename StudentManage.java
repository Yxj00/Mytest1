package com.duixiang.day18.studentmanger;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * ѧ������ϵͳ����˼·
 * 1.��Ҫ����ѧ�����Ա����:ѧ��ѧ��,ѧ������,ѧ������,ѧ����ַ
 * 2.����(ArrayList) ����ѧ�����󼯺� ����ѧ������
 * 3.��ѧ�����󼯺�ʵ����ɾ�Ĳ�
 *
 * ��ע:ѧ����ѧ�� �����ڼ������ǲ������ظ���
 */
/**
 * ѧ������ϵͳ��
 */
public class StudentManage {

    /**
     * ѧ�����󼯺�
     */
    private static ArrayList<Student> stu = new ArrayList<Student>();//���淽����static��  ����ҲҪ��static�ؼ���
    private static boolean isRun=true;//ϵͳ�˳��ķ�ʽһ


    public static void main(String[] args) {
        //1.������ҳ��
        while (isRun) {
            System.out.println("---��ӭ������ѧ������ϵͳ---");
            System.out.println("1.����ѧ��");
            System.out.println("2.�޸�ѧ��");
            System.out.println("3.ɾ��ѧ��");
            System.out.println("4.��ѯѧ��");
            System.out.println("5.�˳�ϵͳ");
            System.out.println("��ѡ��1-5��");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("����ѧ��");
                    addStudent();
                    break;
                case 2:
                    System.out.println("�޸�ѧ��");
                    updateStudent();
                    break;
                case 3:
                    System.out.println("ɾ��ѧ��");
                    deleteStudent();
                    break;
                case 4:
                    System.out.println("��ѯѧ��");
                    showStudent();
                    break;
                case 5:
//                    System.exit(0);ϵͳ�˳���ʽ��
                    isRun=false;
                    System.out.println("�˳�ϵͳ");
                    break;
                    //return;ϵͳ�˳���ʽ��

            }
        }
    }
    /**
     * ����ѧ��
     */
    static void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ����ѧ��:");
        String stuID = sc.nextLine();
        Student student = getByStuID(stuID);
        if (student!=null){
            System.out.println("��ѧ���Ѿ���"+student.getName()+"�ظ������������룡����");
            addStudent();
            return;
        }
        System.out.println("������ѧ��������:");
        String stuName = sc.nextLine();
        System.out.println("������ѧ��������:");
        Integer stuAge = sc.nextInt();
        System.out.println("������ѧ����ס�ĵ�ַ:");
        String stuAddress = sc.next();//������next()  ����nextLine()

        //����Ϣ���뼯����
        stu.add(new Student(stuID, stuName, stuAge, stuAddress));
        System.out.println("�������!");
    }

    /**
     * ��װ�ṩ���� ����ѧ�Ų�ѯ ѧ�����󼯺���ѧ����Ϣ
     * ����ܲ�ѯ�� �򷵻�
     */
    static Student getByStuID(String stuID){
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);//��ȡ�������е�ѧ������
            if (student.getStuID().equals(stuID)){
                return student;//����ѧ������
            }
        }
        return null;
    }
    static void showStudent(){
        if (stu.size()==0){
            System.out.println("�ü�����û�д����κ�ѧ������");
            return;//��������ִ��
        }
        System.out.println("ѧ��\t����\t����\t��ס��");//��\t�Ʊ��
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);
            System.out.println(student.getStuID()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
        }
    }
    /**
     * ɾ��ѧ����Ϣ
     */
    public static void deleteStudent(){
        //ɾ��ѧ�� ѧ����Ψһ���ظ� ����ѧ��ɾ��
        Scanner sc = new Scanner(System.in);
        System.out.println("��������ɾ����ѧ��ѧ��:");
        String sId = sc.nextLine();
        //��Ҫ���ݸ�ѧ�Ų��Ҽ����� �Ƿ���ڸö��� ������ڸö��� �ٵ���
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);//��ȡѧ������
            if (student.getStuID().equals(sId)){
                stu.remove(i);//����index�±�ɾ��
                System.out.println("ɾ���ɹ�");
            }else{
                System.out.println("��ѧ�Ų����ڣ�����������:");
                deleteStudent();
                return;
            }

        }
    }
    /**
     * �޸�ѧ����Ϣ
     */
    static void updateStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("���������޸ĵ�ѧ��ѧ��:");
        String sId = sc.nextLine();
        //����ѧ�Ų���ѧ������
        Student student = getByStuID(sId);
        if (student==null){
            System.out.println("���ݸ�ѧ��û�в�����Ҫ�޸ĵ�ѧ������");
            return;//ʵ�ʿ����ж���
        }
        System.out.println("������ѧ���µ�����:");
        String newStuName = sc.nextLine();
        System.out.println("������ѧ���µ�����:");
        Integer newStuAge = sc.nextInt();
        System.out.println("������ѧ���µľ�ס��ַ:");
        String newStuAddress = sc.next();
        student.setName(newStuName);
        student.setAge(newStuAge);
        student.setAddress(newStuAddress);
        System.out.println("�޸ĳɹ�");
    }
}
