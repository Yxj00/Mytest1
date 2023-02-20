package Tjise.LangQiao.day01;

public class Test01 {
    public static void main(String[] args) {
        int result = 0;
        int i = 2021;
        String str;
        while(true){
            if(i == 0)  break;
            result++;
            str = "" + result;
            for(char c : str.toCharArray()){
                if('1' == c)    i--;
            }
        }
        System.out.println(result);
    }
}
