package aboutObject01.object02.march9th;

public class OutClass01 {
    public String name;
    private  int age;

    /**
     * �ⲿ�����ڲ�
     */
    public void outDisplay(){
//        System.out.println(innerClass.this.name);
        System.out.println(new innerClass().grade);
        InnnerClass02 innnerClass02 = new InnnerClass02();
        innnerClass02.display2();
    }

    /**
     * ˽���ڲ���
     */
    private class  InnnerClass02{
        private void display2(){
            System.out.println("2-name"+name);
        }
    }

    public class innerClass{
        public static innerClass.innerClass03 innerClass03;
        // �ڲ��� Ҳ��ʹ�ó�Ա����  ��������
        String name="in";
        String grade="1";
        public void test(){
            System.out.println("���ǳ�Ա�ڲ���");
        }

        /**
         * �ⲿ��.this
         */
        public void display(){
            System.out.println("name"+this.name);
            System.out.println("name"+OutClass01.this.name+","+age);
        }
        public class innerClass03{
            
        }

    }
}
