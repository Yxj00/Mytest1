package aboutObject01.aboutException.march13th.generic00;

public class TestMethod {
    public static void main(String[] args) {
        score("dsssa");
        // ���ͷ�������ʹ�õ�ʱ���Զ�ȷ����������
        setScore(11);
    }
    private static String score(String scoreNum){
        return scoreNum;
    }
    //��ȷ������

    /**
     * �ڷ���ֵ����ǰ��<N>,����д���ͱ�������ʾ����һ�����ͷ���
     * @param scoreNum
     * @return
     * @param <N>
     */
    public static <N> N setScore(N scoreNum){
        return scoreNum;

    }
}
