package com.duixiang;

/**
 * 构造方法
 */
public class Student2 {
    private String name;
    private int age;
    /**
     * 修饰符 类的名称（参数）{
     *
     * }
     * 一般默认情况下 修饰符是public
     *
     * 注意-----构造方法 方法的名称一定与类的名称是一样的
     */
    public Student2(){//无参构造方法
        System.out.println("student2已经开始初始化了");
    }
    public Student2(String name){//有参构造方法
        this.name=name;  //成员变量=局部变量
    }
    public String show(){
        return name+"-"+age;
    }

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
        if (age<0||age>120){
            System.out.println("输入有误欧！");
            return;
        }
        this.age = age;
    }
    /**
     * 构造方法的应用场景：就是可以给我们的对象中的成员属性赋值
     * 构造方法分类：1，无参构造方法 2，有参构造方法
     * 无参构造方法：该构造方法没有传递任何的参数
     * 有参构造方法：该构造方法传递参数---对象中的成员属性赋值
     * 注意-----如果在类中 没有定义任何构造方法 系统会自动的生成一个 无参构造方法
     *
     */
}
