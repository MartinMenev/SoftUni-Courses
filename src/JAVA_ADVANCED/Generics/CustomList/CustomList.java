package JAVA_ADVANCED.Generics.CustomList;

import java.util.ArrayList;
import java.util.Collections;

public class CustomList <T extends Comparable <T>> extends ArrayList<T>{


    public T remove(int index) {
        T toRemove = this.get(index);
        this.remove(toRemove);
        return toRemove;
    }



    public void swap (int index1, int index2) {
        T temp = this.get(index1);
        this.set(index1, this.get(index2));
        this.set(index2, temp);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T t : this) {
            if (t.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMin() {
        return this
                .stream()
                .sorted().findFirst().orElseThrow(IllegalArgumentException::new);
    }
    public T getMax() {
        return this.stream().min(Collections.reverseOrder()).orElseThrow(IllegalArgumentException::new);
    }

}
