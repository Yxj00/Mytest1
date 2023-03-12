package regularExpression.march12th;

public class RegString {
    public static void main(String[] args) {
        String content="JDK1.3,JDK1.4健康骄傲的爸爸";
        /**
         * 使用正则表达式 将JDK1.3和JDK1.4替换成JDK
         */
        content = content.replaceAll("JDK1\\.3|JDK1\\.4", "JDK");
        System.out.println(content);
        //验证一个手机号 要求必须是以138或者139开头
        content="13889999777";
        if (content.matches("1(38|39)\\d{8}")){
            System.out.println("验证成功");
        }else {
            System.out.println("验证失败");
        }
        //要求按照#或者-或者~或者按数字来分割
        String content1="hello#abc%jack-smimi12hh~北京";
        String[] s = content1.split("#|-|~|\\d+");
        for (String s1:s){
            System.out.print(s1+"\t");
        }
    }
}
