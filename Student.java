package com.duixiang.day18.studentmanger;

public class Student {
    /**
     *学生学号 不允许重复
     */
    private String stuID;
    /*
    学生姓名
     */
    private String name;
    /**
     * 都是使用引用类型  int 默认为0  Integer 默认值为null
     * 学生年龄
     */
    private Integer age;
    /**
     * 学生地址
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
