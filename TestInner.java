package aboutObject01.object02.march9th;

public class TestInner {
    public static void main(String[] args) {
        OutClass01 outClass = new OutClass01();
        // ���ַ�ʽ�����ڲ���
        outClass.outDisplay();// �ɼ�ӷ���˽���ڲ���
        OutClass01.innerClass inTest= new OutClass01().new innerClass();
        OutClass01.innerClass inTest1=outClass.new innerClass();
        OutClass01.innerClass.innerClass03 inTest3= OutClass01.innerClass.innerClass03;
    }
}
