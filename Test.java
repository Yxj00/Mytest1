package aboutObject01.object01.marchsixth.aboutEnum;

public class Test {
    public static void main(String[] args) {
        Clothes c = new Clothes();
        c.setColor(ClothesStatus.RED);
        System.out.println(c.getColor());
        System.out.println(c.getColor().getName());
    }
}
