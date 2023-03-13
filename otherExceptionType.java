package aboutObject01.aboutException.march13th;

public class otherExceptionType {
    public static void main(String[] args) {
        /**
         * 非运行异常
         *编译时异常  必须处理
         */
        otherExceptionType o = new otherExceptionType();
        try {
            o.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
