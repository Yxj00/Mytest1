package com.duixiang.day10;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        //�������������ڴ��ַ��ֱͬ�ӷ���true
        if (this==obj){
            return true;
        }
       //�Ƚ���������������Ƿ�һ�� ������.getclass()
        if (obj==null||this.getClass()!=obj.getClass()){//�����������Ͳ�һ�� �򷵻�true
            return false;
        }
        //���������������һ�µ� ��Ƚ���������ĳ�Ա����ֵ
        //string������equals�����Ƚ� �����ַ�����ֵ���   String�ײ���д��object����
        return this.age==((Student) obj).age&&this.name.equals(((Student) obj).name);
    }
}
