package task1.question2_1;

import task1.question2_2.Product;

import java.util.Iterator;

public class MyIterator <E>implements Iterator<E>{
Product product = new Product();
private E [] object;
private int index=0;
;

    public MyIterator() {
    }

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
    @Override
    public  void remove(){
        if (product.getPrice()<55){

        }
    }

}
