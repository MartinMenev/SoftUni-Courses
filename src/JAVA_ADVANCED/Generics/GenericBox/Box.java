package JAVA_ADVANCED.Generics.GenericBox;


public class Box <T extends Comparable<T>> {
    public T value;

    public Box(T value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return String.format("%s: %s", value.getClass().getTypeName(),value);
    }

    public int compareTo(Box<T> element) {
        return this.value.compareTo(element.value);
        }
    }

