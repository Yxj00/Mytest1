package regularExpression.march12th;

public class RegExpTest06 {
    public static void main(String[] args) {
        //��������Ľ�
        String content="https://www.sodu.com:8080/abc/index.htm";
        String regStr="^([a-zA-Z]+)://([a-zA-Z.]+):(\\d+)[\\w-/]*/([\\w.])+$";
        if (content.matches(regStr)){
            System.out.println("ƥ��ɹ�");
        }else {
            System.out.println("ƥ��ʧ��");
        }
    }
}
