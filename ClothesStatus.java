package aboutObject01.object01.marchsixth.aboutEnum;

public enum ClothesStatus {
    RED("��ɫ"),GREEN("��ɫ"),BLUE("��ɫ");
    private final String name;// ö�ٵĳ�Ա����

    // ����ԭ�еĹ��췽��
    ClothesStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
