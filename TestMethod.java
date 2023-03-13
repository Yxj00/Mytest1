package aboutObject01.aboutException.march13th.generic00;

public class TestMethod {
    public static void main(String[] args) {
        score("dsssa");
        // 泛型方法会在使用的时候，自动确定泛型类型
        setScore(11);
    }
    private static String score(String scoreNum){
        return scoreNum;
    }
    //不确定类型

    /**
     * 在返回值类型前面<N>,并填写泛型变量，表示这是一个泛型方法
     * @param scoreNum
     * @return
     * @param <N>
     */
    public static <N> N setScore(N scoreNum){
        return scoreNum;

    }
}
