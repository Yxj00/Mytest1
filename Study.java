package aboutObject01.object01.marchsixth;

/**
 * �ӿ���ֻ�ܶ������Ȩ��Ϊpublic
 * default�ؼ���Ϊ�ӿ����Ĭ��ʵ��
 *     ��ǿ��Ҫ����ҽ���ʵ��
 *     �ӿ��в�������ڳ�Ա�����ͳ�Ա����
 *     ���Դ��ھ�̬�����;�̬����
 */
public interface Study {
//    public abstract void study();
//    Ĭ����public abstract ����ʡ��
    void study();
    /*
    default�ؼ���Ϊ�ӿ����Ĭ��ʵ��
    ��ǿ��Ҫ����ҽ���ʵ��
     */
    default void test(){
        System.out.println("����Ĭ��ʵ��");
    }
    /*
    �ӿ��ж���ı���ǰ�� Ĭ��public static final
    public static final int score=60;

    �ӿ��ж���ľ�̬����ֻ����public
     */
    int score=60;

    static void aboutStudy(){
        System.out.println("���Ǿ�̬����");
    }
  // ϵͳ����õ��Ѿ��е����ݣ�����Ҫ��д�̳�
    boolean equals(Object object);
}
