package aboutObject01.object01.day01;


public class Person {
    private String name;
    private int age;
    private String sex;
    public void shout(){
        System.out.println("��Ƴ������� ������");
    }
    public void run(){
        System.out.println("�Ƴ�������  ˤ�˸�����ʺ");
    }
    public void grow(){
        System.out.println("�Ƴ�3���� �������ҡ");
    }
    public Person(){

        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
