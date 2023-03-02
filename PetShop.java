package aboutObject01.object01.day03;

public class PetShop {
    private String petName;
    private int petType;
    private int breed;
    private int health;

    private PetShop() {// 不能被new出来   要先实例化 自己new出自己

    }

    public static PetShop getInstance() {
        PetShop petShop = new PetShop();
        return petShop;
    }

    {
        System.out.println("欢迎您来到宠物店！");
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetType() {
        return petType;
    }

    public void setPetType(int petType) {
        this.petType = petType;
        if (petType == 1) System.out.print("请选择狗狗的品种:(1.聪明的拉布拉多犬 2.酷酷的雪纳瑞)");
        ;
        if (petType == 2) System.out.print("请选择企鹅的品种:(1.高贵的帝企鹅 2.可爱的小蓝企鹅)");
        ;

    }

    public String getBreed() {
        if (breed == 1 && petType == 1) return "聪明的拉布拉多犬";
        if (breed == 2 && petType == 1) return "酷酷的雪纳瑞";
        if (breed == 1 && petType == 2) return "高贵的帝企鹅 ";
        if (breed == 2 && petType == 2) return "可爱的小蓝企鹅";
        return "不好意思 没有这品种";

    }

    public void setBreed(int breed) {
        this.breed = breed;

    }

    public int getHealth() {
        if (health >= 1 && health <= 100) return health;
        return 60;
    }

    public void setHealth(int health) {
        this.health = health;
        if (health > 100) System.out.println("健康值应该在0至100之间，默认值为60");
    }
}
