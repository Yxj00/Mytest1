package Tjise.LangQiao.day01;

/**
 * ��Ƭ
 */
public class KaPian {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=2021;
        }
        int result=0;//���
        for (result=1;result<9999;result++){
            String str=String.valueOf(result);//��int����ת����String����
            String[] split=str.split("");//����ָ������
//            System.out.println(split);
            for (String s:split){//��������
                int i=Integer.parseInt(s);//���ַ���ת��int���� ���ҷ��ص���0-9�ĵ�������
//                System.out.println(i);
                if (arr[i]>0){//arr[0-9]ÿ������2021����Ƭ
                    arr[i]-=1;//������Ƭ
                }else {
                    System.out.println(result-1);//���һ�β�������ɾȥ
                    return;
                }
            }

        }
    }
}
