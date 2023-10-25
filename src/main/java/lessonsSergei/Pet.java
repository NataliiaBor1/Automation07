package lectionsSergei;

public class Pet implements IName{

    private String kind;
    private String name;

    public Pet(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }
}
