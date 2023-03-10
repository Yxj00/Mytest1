package aboutObject01.object02.march10th.lambda;

public class LambdaClass {
 /*   IFoo ifoo=new IFoo(){
        @Override
        public void display() {

        }
    };*/
 public static void main(String[] args) {
     // 接口里有一个待实现的方法用这个
     // 不带参数
     IFoo ifoo=()-> System.out.println("我是ikun");
     //带参数
     ifoo.display();
     // 若表达式只有一句，且有return的话可以省略{}以及return
     Study study=(level,y) -> "level"+level;
     study.studyLevel(1, 1);
     /**
      * 局部变量：lambda表达式使用的变量应为final
      * 不可修改
      */
     int a=1;
     Study stu=((level, y) ->{
         System.out.println("学习阶段"+a);
         return "level"+level;
     });
    stu.studyLevel(1,1);
 }
}
