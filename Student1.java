package com.duixiang;

public class Student1 {
  private  String name;//学生名字
    private int age;//学生年龄
    /*加封装后 被其修饰的成员只能在本类中被访问，可以保护成员不被其他类使用 */
    public void study(){
        System.out.println("学习java语言ing");
    }
    /**
     * 第一次 接触get set
     */
//    public void setAge(int age){//定义方法名称的规范 多个单词时 驼峰式 第一次单词首字母小写 第二个单词首字母大写
//        if (age<0||age>120){
//            System.out.println("很抱歉，您所赋值的年龄 是不正确的");
//            return;//后面代码不执行
//        }
//        this.age=age;
//
//        /**
//         *    this.age成员变量   age是局部变量
//         */
//    }
//    public int getAge(){
//        return this.age;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return this.name;
//    }
    /**
     * get ----直接获取成员变量的值
     * set-----就是给我们成员变量赋值操作
     */

    /**
     * 创建get set的快捷方法 鼠标右键 点击Generate getter and setter
     */
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
}
