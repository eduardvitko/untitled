package task1.question2_1;

import java.util.Iterator;

public class MyIterator <E>implements Iterator<E>{

private E [] object;
private int index=0;
private int value = 0;

    public MyIterator(E[] object, int index) {
        object = object;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        return index < object.length;
    }

    @Override
    public E next() {
        return object[index++];
    }
}
