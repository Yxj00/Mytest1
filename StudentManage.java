package com.duixiang.day18.studentmanger;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 学生管理系统代码思路
 * 1.需要定义学生类成员属性:学生学号,学生姓名,学生年龄,学生地址
 * 2.容器(ArrayList) 定义学生对象集合 存入学生对象
 * 3.对学生对象集合实现增删改查
 *
 * 备注:学生的学号 存入在集合中是不允许重复的
 */
/**
 * 学生管理系统类
 */
public class StudentManage {

    /**
     * 学生对象集合
     */
    private static ArrayList<Student> stu = new ArrayList<Student>();//下面方法是static的  这里也要加static关键字
    private static boolean isRun=true;//系统退出的方式一


    public static void main(String[] args) {
        //1.开发主页面
        while (isRun) {
            System.out.println("---欢迎您进入学生管理系统---");
            System.out.println("1.新增学生");
            System.out.println("2.修改学生");
            System.out.println("3.删除学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请选择【1-5】");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("新增学生");
                    addStudent();
                    break;
                case 2:
                    System.out.println("修改学生");
                    updateStudent();
                    break;
                case 3:
                    System.out.println("删除学生");
                    deleteStudent();
                    break;
                case 4:
                    System.out.println("查询学生");
                    showStudent();
                    break;
                case 5:
//                    System.exit(0);系统退出方式三
                    isRun=false;
                    System.out.println("退出系统");
                    break;
                    //return;系统退出方式二

            }
        }
    }
    /**
     * 新增学生
     */
    static void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的学号:");
        String stuID = sc.nextLine();
        Student student = getByStuID(stuID);
        if (student!=null){
            System.out.println("该学号已经被"+student.getName()+"重复，请重新输入！！！");
            addStudent();
            return;
        }
        System.out.println("请输入学生的姓名:");
        String stuName = sc.nextLine();
        System.out.println("请输入学生的年龄:");
        Integer stuAge = sc.nextInt();
        System.out.println("请输入学生居住的地址:");
        String stuAddress = sc.next();//这里用next()  不用nextLine()

        //将信息存入集合中
        stu.add(new Student(stuID, stuName, stuAge, stuAddress));
        System.out.println("新增完成!");
    }

    /**
     * 封装提供方法 根据学号查询 学生对象集合中学生信息
     * 如果能查询到 则返回
     */
    static Student getByStuID(String stuID){
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);//获取到集合中的学生对象
            if (student.getStuID().equals(stuID)){
                return student;//返回学生对象
            }
        }
        return null;
    }
    static void showStudent(){
        if (stu.size()==0){
            System.out.println("该集合中没有存入任何学生对象");
            return;//程序不向下执行
        }
        System.out.println("学号\t姓名\t年龄\t居住地");//用\t制表符
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);
            System.out.println(student.getStuID()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
        }
    }
    /**
     * 删除学生信息
     */
    public static void deleteStudent(){
        //删除学生 学号是唯一不重复 根据学号删除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需删除的学生学号:");
        String sId = sc.nextLine();
        //需要根据该学号查找集合中 是否存在该对象 如果存在该对象 再调用
        for (int i = 0; i < stu.size(); i++) {
            Student student = stu.get(i);//获取学生对象
            if (student.getStuID().equals(sId)){
                stu.remove(i);//根据index下标删除
                System.out.println("删除成功");
            }else{
                System.out.println("该学号不存在，请重新输入:");
                deleteStudent();
                return;
            }

        }
    }
    /**
     * 修改学生信息
     */
    static void updateStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需修改的学生学号:");
        String sId = sc.nextLine();
        //根据学号查找学生对象
        Student student = getByStuID(sId);
        if (student==null){
            System.out.println("根据该学号没有查找需要修改的学生对象");
            return;//实际开发中多用
        }
        System.out.println("请输入学生新的姓名:");
        String newStuName = sc.nextLine();
        System.out.println("请输入学生新的年龄:");
        Integer newStuAge = sc.nextInt();
        System.out.println("请输入学生新的居住地址:");
        String newStuAddress = sc.next();
        student.setName(newStuName);
        student.setAge(newStuAge);
        student.setAddress(newStuAddress);
        System.out.println("修改成功");
    }
}
