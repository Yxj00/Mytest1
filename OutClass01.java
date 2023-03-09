package aboutObject01.object02.march9th;

public class OutClass01 {
    public String name;
    private  int age;

    /**
     * 外部访问内部
     */
    public void outDisplay(){
//        System.out.println(innerClass.this.name);
        System.out.println(new innerClass().grade);
        InnnerClass02 innnerClass02 = new InnnerClass02();
        innnerClass02.display2();
    }

    /**
     * 私有内部类
     */
    private class  InnnerClass02{
        private void display2(){
            System.out.println("2-name"+name);
        }
    }

    public class innerClass{
        public static innerClass.innerClass03 innerClass03;
        // 内部类 也可使用成员变量  持续套娃
        String name="in";
        String grade="1";
        public void test(){
            System.out.println("我是成员内部类");
        }

        /**
         * 外部类.this
         */
        public void display(){
            System.out.println("name"+this.name);
            System.out.println("name"+OutClass01.this.name+","+age);
        }
        public class innerClass03{
            
        }

    }
}
