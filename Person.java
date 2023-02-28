package aboutObject01.object01.day01;


public class Person {
    private String name;
    private int age;
    private String sex;
    public void shout(){
        System.out.println("孙浩晨出生了 哇哇哇");
    }
    public void run(){
        System.out.println("浩晨会跑了  摔了个狗吃屎");
    }
    public void grow(){
        System.out.println("浩晨3岁了 来段社会摇");
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
