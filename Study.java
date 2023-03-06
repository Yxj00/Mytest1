package aboutObject01.object01.marchsixth;

/**
 * 接口中只能定义访问权限为public
 * default关键字为接口添加默认实现
 *     不强制要求对我进行实现
 *     接口中不允许存在成员变量和成员方法
 *     可以存在静态变量和静态方法
 */
public interface Study {
//    public abstract void study();
//    默认是public abstract 可以省略
    void study();
    /*
    default关键字为接口添加默认实现
    不强制要求对我进行实现
     */
    default void test(){
        System.out.println("我是默认实现");
    }
    /*
    接口中定义的变量前面 默认public static final
    public static final int score=60;

    接口中定义的静态方法只能是public
     */
    int score=60;

    static void aboutStudy(){
        System.out.println("我是静态方法");
    }
  // 系统定义好的已经有的内容，不需要重写继承
    boolean equals(Object object);
}
