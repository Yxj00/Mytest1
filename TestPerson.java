package aboutObject01.object01.day01;

public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("��Ƴ�");
        person.setAge(0);
        person.setSex("Ů");
        System.out.println("�����ɫ������...");
        System.out.println("����:"+person.getName());
        System.out.println("�Ա�:"+person.getSex());
        System.out.println("����:"+person.getAge());
        System.out.println("���������ɹ�...��");
        person.shout();
        person.run();
        person.grow();
        AutoLion autoLion = new AutoLion();
        System.out.println(autoLion.name);
        autoLion.run();
        autoLion.robBall();
    }
}
