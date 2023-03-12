package regularExpression.march12th;

public class RegExpTest06 {
    public static void main(String[] args) {
        //根据需求改进
        String content="https://www.sodu.com:8080/abc/index.htm";
        String regStr="^([a-zA-Z]+)://([a-zA-Z.]+):(\\d+)[\\w-/]*/([\\w.])+$";
        if (content.matches(regStr)){
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
    }
}
