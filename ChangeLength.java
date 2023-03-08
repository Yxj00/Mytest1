package aboutObject01.object01.marchEighth;

public class ChangeLength {
    public void test(String...strings){
        System.out.println(strings);
        // strings 在这里面是一个string[]数组
        for(String s:strings){
            System.out.println(s);
        }
    }
    /**
     * 同时存在多个参数
     * 可变长参数放在最后面
     * @param a
     * @param b
     * @param strings
     */
    public void test1(int a,int b,String...strings){

    }

    public static void main(String[] args) {
        ChangeLength c1 = new ChangeLength();
        c1.test("孙浩晨","孙浩晨2号","孙浩晨3号");
        c1.test1(1,2,"孙浩晨","孙浩晨2号","孙浩晨3号");
        //args命令行参数
        for (String arg:args){
            System.out.println(arg);
        }
    }
}
