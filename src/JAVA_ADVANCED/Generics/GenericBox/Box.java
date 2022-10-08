package JAVA_ADVANCED.Generics.GenericBox;

public class Box <T> {
    public T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", value.getClass().getTypeName(),value);
    }
}
