package aboutObject01.object02.march10th.lambda;

public class LambdaClass {
 /*   IFoo ifoo=new IFoo(){
        @Override
        public void display() {

        }
    };*/
 public static void main(String[] args) {
     // �ӿ�����һ����ʵ�ֵķ��������
     // ��������
     IFoo ifoo=()-> System.out.println("����ikun");
     //������
     ifoo.display();
     // �����ʽֻ��һ�䣬����return�Ļ�����ʡ��{}�Լ�return
     Study study=(level,y) -> "level"+level;
     study.studyLevel(1, 1);
     /**
      * �ֲ�������lambda���ʽʹ�õı���ӦΪfinal
      * �����޸�
      */
     int a=1;
     Study stu=((level, y) ->{
         System.out.println("ѧϰ�׶�"+a);
         return "level"+level;
     });
    stu.studyLevel(1,1);
 }
}
