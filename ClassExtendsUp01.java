package aboutObject01.object02.march15th;

public class ClassExtendsUp01<N extends Number>{
    private String name;
    private String id;
    public N value;

    public ClassExtendsUp01(String name, String id, N value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }
}
