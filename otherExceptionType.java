package aboutObject01.aboutException.march13th;

public class otherExceptionType {
    public static void main(String[] args) {
        /**
         * �������쳣
         *����ʱ�쳣  ���봦��
         */
        otherExceptionType o = new otherExceptionType();
        try {
            o.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
