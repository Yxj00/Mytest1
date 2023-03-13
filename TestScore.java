package aboutObject01.aboutException.march13th.generic00;

public class TestScore {
    /**
     * ��ļ̳�
     * 1����ȷ����
     */
    static class Student implements Score<String>{

        @Override
        public String setScore() {
            return "Ĭ��ֵ";
        }
    }
    //2.����ȷ����
    static class Teacher<S> extends Person<String> implements Score<S>{

        @Override
        public S setScore() {
            return null;
        }
    }
    // 3.�̳�
    static class Person<A>{
        A age;
    }
    public static void main(String[] args) {
        Student student = new Student();
        String score = student.setScore();
        System.out.println(score);

        Teacher<String> t = new Teacher<>();
        String score1 = t.setScore();
    }
}
