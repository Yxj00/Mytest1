package aboutObject01.aboutException.march13th;

public class Student<T>{
    //T ��������ȡ ���ܿ��ؼ���
    String name;
    String id;
    //Object age;
    T age;

    public Student(String name, String id, T age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public T getAge(){return age;}
}
