package com.duixiang.day18.studentmanger;

public class Student {
    /**
     *ѧ��ѧ�� �������ظ�
     */
    private String stuID;
    /*
    ѧ������
     */
    private String name;
    /**
     * ����ʹ����������  int Ĭ��Ϊ0  Integer Ĭ��ֵΪnull
     * ѧ������
     */
    private Integer age;
    /**
     * ѧ����ַ
     */
    private String address;

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String stuID, String name, Integer age, String address) {
        this.stuID = stuID;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
