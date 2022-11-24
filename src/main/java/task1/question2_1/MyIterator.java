package task1.question2_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator<Product> implements Iterator<Integer> {
    task1.question2_1.Product product = new task1.question2_1.Product();

    private List<Product> productList = new ArrayList<>();
    private int index = 0;

    public MyIterator() {

    }

    public MyIterator(List<Product> productList, int index) {
        this.productList = productList;
        this.index = index;

    }

    @Override
    public boolean hasNext() {
        return index < productList.size();
    }

    @Override
    public Integer next() {
        return (Integer) productList.get(index);
    }
}
