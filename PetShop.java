package aboutObject01.object01.day03;

public class PetShop {
    private String petName;
    private int petType;
    private int breed;
    private int health;

    private PetShop() {// ���ܱ�new����   Ҫ��ʵ���� �Լ�new���Լ�

    }

    public static PetShop getInstance() {
        PetShop petShop = new PetShop();
        return petShop;
    }

    {
        System.out.println("��ӭ����������꣡");
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
        if (petType == 1) System.out.print("��ѡ�񹷹���Ʒ��:(1.��������������Ȯ 2.����ѩ����)");
        ;
        if (petType == 2) System.out.print("��ѡ������Ʒ��:(1.�߹�ĵ���� 2.�ɰ���С�����)");
        ;

    }

    public String getBreed() {
        if (breed == 1 && petType == 1) return "��������������Ȯ";
        if (breed == 2 && petType == 1) return "����ѩ����";
        if (breed == 1 && petType == 2) return "�߹�ĵ���� ";
        if (breed == 2 && petType == 2) return "�ɰ���С�����";
        return "������˼ û����Ʒ��";

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
        if (health > 100) System.out.println("����ֵӦ����0��100֮�䣬Ĭ��ֵΪ60");
    }
}
