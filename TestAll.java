package aboutObject01.object01.marchsixth;

public class TestAll {
    public static void main(String[] args) {
        //接口不能直接创建对象
        // 接口实现类的对象以接口
        /*
        向上转型
        编译看编译期类型
        运行看运行期类型
        无法使用类本身的方法和父类方法
        当作接口使用时，只有接口定义的方法和object类方法
         */
        Study  stu = new Student();
        stu.study();
        //stu.name; --无法使用

        /*
        接口同样支持向下转型
        向下转型
         */
        Study t=new Teacher();
        // 直接判断引用对象是不是Teacher类型
        if (t instanceof Teacher){
            Teacher teacher= (Teacher) t;
            System.out.println(teacher.name);
        }
        if (t instanceof Person){
            System.out.println("属于Person");
        }
        if (t instanceof Student){
            System.out.println("属于Student");
        }
        if (t instanceof Study){
            System.out.println("属于Study");
        }
        /*
        当接口与父类同时存在方法时
        以父类为准 优先
         */
    }
}
