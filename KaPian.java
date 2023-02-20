package Tjise.LangQiao.day01;

/**
 * 卡片
 */
public class KaPian {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=2021;
        }
        int result=0;//结果
        for (result=1;result<9999;result++){
            String str=String.valueOf(result);//将int类型转换成String类型
            String[] split=str.split("");//将其分割成数组
//            System.out.println(split);
            for (String s:split){//遍历数组
                int i=Integer.parseInt(s);//将字符串转回int类型 并且返回的是0-9的单个数字
//                System.out.println(i);
                if (arr[i]>0){//arr[0-9]每个都是2021个卡片
                    arr[i]-=1;//消除卡片
                }else {
                    System.out.println(result-1);//最后一次不够减需删去
                    return;
                }
            }

        }
    }
}
