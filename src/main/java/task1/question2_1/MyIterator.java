package task1.question2_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator implements Iterable{

    @Override
    public Iterator iterator() {
        while (iterator().hasNext()){
             iterator().next();
        }
        return iterator();
    }
    public static List<Product> sortProducts(List<Product>productList){
        List<Product> products = new ArrayList<>();
        for (Product prod:productList) {
            if(prod.getPrice() > 100){
               products.add(prod);
            }
        }
        return products;
    }
}
