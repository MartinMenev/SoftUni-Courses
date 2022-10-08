package JAVA_ADVANCED.Generics.CustomList;


import java.util.Collections;
import java.util.List;

public class Sorter {

    public static <T extends Comparable<T>> void sort(CustomList<T> list) {
        Collections.sort(list);
    }
}
