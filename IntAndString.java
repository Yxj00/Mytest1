package aboutObject01.object01.marchSeventh;

public class IntAndString {
    public static void main(String[] args) {
        /**
         * Int 和 string 相互转换
         */
        // 方式一
        int i=10;
        String i1=i+"";
        //方式二
        String s = String.valueOf(i);
        // string -->int
        String x="400";
        // 方式一
        Integer x1 = Integer.valueOf(x);
        int x2= x1.intValue();
        // 方式二 parseInt
        int i2 = Integer.parseInt(x);

    }
}
