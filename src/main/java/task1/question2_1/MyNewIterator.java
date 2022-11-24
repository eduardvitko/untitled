package task1.question2_1;

import java.util.Iterator;

public class MyNewIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
    MyNewIterator newIterator = new MyNewIterator();
}
