package JAVA_ADVANCED.Iterators_Comparators.stackIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stack<Integer> implements Iterable<Integer> {
    private List<Integer> currentStack;
    private int currentPosition;

    @SafeVarargs
    public final void push(Integer... elements) {
        this.currentStack = new ArrayList<>();
        if (elements.length !=0) {
            this.currentStack.addAll(Arrays.asList(elements));
        }

    }

    public void pop() {
        if (currentStack.isEmpty()) {
            System.out.println("No elements");
        } else {
            Integer element = currentStack.get(currentStack.size() -1);
            currentStack.remove(element);
        }
    }

    public void print(){
        for (int i = currentStack.size() -1; i >= 0 ; i--) {
            System.out.println(currentStack.get(i));
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return currentPosition < currentStack.size() - 1;
            }

            @Override
            public Integer next() {
                Integer element = null;
                if (hasNext()) {
                    element = currentStack.get(currentStack.size() -1);
                }
                return element;
            }
        };
    }
}
