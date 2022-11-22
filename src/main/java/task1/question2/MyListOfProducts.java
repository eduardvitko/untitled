package task1.question2;

import java.util.*;

import static java.lang.System.arraycopy;

public class MyListOfProducts<E> implements List<E> {
    int capacity = 100;
    private Object[] products = new Object[capacity];
    private int index = 0;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public void increaseSize() {
        capacity = capacity + 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyListOfProducts<?> that = (MyListOfProducts<?>) o;
        return capacity == that.capacity && index == that.index && size == that.size && Arrays.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, index, size);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public boolean add(Object object) {
        boolean pointer = false;
        if (size() < capacity) {
            products[size] = object;
            size++;
            pointer = true;
        }
        if (size() < capacity) {
            increaseSize();
            products[size] = object;
            pointer = true;
        }
        return pointer;
    }

    @Override
    public boolean remove(Object object) {
        boolean pointer = true;
        for (int i = 0; i < size(); i++) {
            if(object.equals(products[i])){
                products[i]=null;
                size--;
                pointer=true;
            }

        }
        return pointer;
    }

    @Override
    public boolean contains(Object object) {
        boolean pointer =false;
        for (int i = 0; i < size(); i++) {
            if(object.equals(products[i])){
                 pointer = true;
            }
        }
        return pointer;
    }
    @Override
    public boolean addAll(Collection collection) {
        boolean pointer = false;
        for (Object object:collection) {
            add(object);
            return pointer = true;}
        return pointer;
    }

    @Override
    public boolean addAll(int index, Collection collection) {
        boolean pointer = false;
        for (Object object: collection){
           add (index++, object);
            pointer=true;
        }
        return pointer;
    }

    @Override
    public void clear() {
        for (int i = 0; i < products.length; i++) {
            products[i] = 0;
        }
        size = 0;
    }

    @Override
    public E get(int index) {
        return (E) products[index];
    }

    @Override
    public Object set(int index, Object element) {
        products[index] = element;
        return (E) products[index];
    }

    @Override
    public void add(int index, Object element) {
        if (index < size()) {
            arraycopy(products, index, products, index + 1, size() - index);
            products[index]=element;
        }
        size++;
    }

    @Override
    public E remove(int index) {
        if(products[index]!=null){
            products[index]=null;
            size--;
        }
        return (E) products[index];
    }

    @Override
    public int indexOf(Object object) {
        if(object==null){
            for (int i=0;i < size;i++){
                if (products[i]==null){
                    return i;
                }
            }
        }
        else {
           for (int i = 0; i < size; i++){
               if(object.equals(products[i])){
                   return i;
               }
           }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public boolean retainAll(Collection collection) {
        for (Object object:collection) {
            if(!contains(object)){
                return false;
            }

        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        boolean pointer = false;
        Iterator<?> it = iterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
               pointer = true;
            }
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        for (Object object:collection) {
            if(!contains(object)){
                return false;
            }

        }
        return true;
    }
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(products,size);
    }

    @Override
    public Object[] toArray(Object[] arr) {
        if(arr.length<size)
            return (Object[])Arrays.copyOf(products,size,arr.getClass());
            System.arraycopy(products, 0, arr, 0, size);
            if(arr.length > size){
                arr[size]=null;
            }
            return arr;
    }
    @Override
    public Iterator<E> iterator()  {

        return new Iterator() {
            @Override
            public boolean hasNext() {
                return index < products.length;
            }

            @Override
            public Object next() {
                return products[index++];
            }
        };
    }


    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }
    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}
