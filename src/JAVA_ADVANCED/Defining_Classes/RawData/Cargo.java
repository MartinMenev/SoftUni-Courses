package JAVA_ADVANCED.Defining_Classes.RawData;

public class Cargo {
    private final String type;

    public Cargo(int weight, String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
