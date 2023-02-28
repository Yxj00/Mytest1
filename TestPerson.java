package aboutObject01.object01.day01;

public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("孙浩晨");
        person.setAge(0);
        person.setSex("女");
        System.out.println("人物角色创建中...");
        System.out.println("姓名:"+person.getName());
        System.out.println("性别:"+person.getSex());
        System.out.println("年龄:"+person.getAge());
        System.out.println("宿主创建成功...叮");
        person.shout();
        person.run();
        person.grow();
        AutoLion autoLion = new AutoLion();
        System.out.println(autoLion.name);
        autoLion.run();
        autoLion.robBall();
    }
}
