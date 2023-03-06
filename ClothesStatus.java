package aboutObject01.object01.marchsixth.aboutEnum;

public enum ClothesStatus {
    RED("红色"),GREEN("绿色"),BLUE("蓝色");
    private final String name;// 枚举的成员变量

    // 覆盖原有的构造方法
    ClothesStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
