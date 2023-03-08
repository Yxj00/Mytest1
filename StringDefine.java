package aboutObject01.object01.marchEighth;

public class StringDefine {
    public static void main(String[] args) {
        // 定义方法
        String s1="hello";
        String s2 = new String();
        String s3 = new String("hello");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        String s11="hello";
        System.out.println(s11==s1);
        String s33 = new String("hello");
        System.out.println(s3==s33);
        System.out.println(s3.equals(s33));

        String str="wlkk";
        System.out.println(str.length());
        //2.索引
        System.out.println(str.charAt(1));
        //3. indexOf -- 查找对应字符的位置，没有返回-1
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("s"));
    }
}
