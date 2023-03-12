package regularExpression.march10th;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp03 {
    /**
     * ����
     * @param args
     */
    public static void main(String[] args) {
        String content="hanshunping s7789 nn1189han";

        /**
         * ()
         * ������Ƿ���������
         * ˵��
         * 1.matcher.group(0)�õ�ƥ�䵽���ַ���
         * 2.matcher.group(1)�õ�ƥ�䵽���ַ����ĵ�1����������
         * 3.matcher.group(2)�õ�ƥ�䵽���ַ����ĵ�2����������
         */

       /* String regStr="(\\d\\d)(\\d\\d)";//ƥ��4������
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("�ҵ�:"+matcher.group(0));
            System.out.println("��1����������:"+matcher.group(1));
            System.out.println("��2����������:"+matcher.group(2));
        }*/
        /**
         * �������飺���Ը�����ȡ��
         *
         */
        String regStr="(?<g1>\\d\\d)(?<g2>\\d\\d)";//
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("�ҵ�:"+matcher.group(0));
            System.out.println("��1����������:"+matcher.group(1));
            System.out.println("��1����������[ͨ������]:"+matcher.group("g1"));
            System.out.println("��2����������:"+matcher.group(2));
            System.out.println("��2����������[ͨ������]:"+matcher.group("g2"));
        }
    }
}
