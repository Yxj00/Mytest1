package regularExpression.march12th;

public class RegString {
    public static void main(String[] args) {
        String content="JDK1.3,JDK1.4���������İְ�";
        /**
         * ʹ��������ʽ ��JDK1.3��JDK1.4�滻��JDK
         */
        content = content.replaceAll("JDK1\\.3|JDK1\\.4", "JDK");
        System.out.println(content);
        //��֤һ���ֻ��� Ҫ���������138����139��ͷ
        content="13889999777";
        if (content.matches("1(38|39)\\d{8}")){
            System.out.println("��֤�ɹ�");
        }else {
            System.out.println("��֤ʧ��");
        }
        //Ҫ����#����-����~���߰��������ָ�
        String content1="hello#abc%jack-smimi12hh~����";
        String[] s = content1.split("#|-|~|\\d+");
        for (String s1:s){
            System.out.print(s1+"\t");
        }
    }
}
