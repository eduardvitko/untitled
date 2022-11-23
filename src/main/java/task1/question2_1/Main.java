package task1.question2_1;

import task1.question2_2.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Product rise = new Product(1, "Rise", 30);
        Product bread = new Product(2, "Bread", 22);
        Product butter = new Product(3, "Butter", 74);
        Product fish = new Product(4, "Fish", 150);
        Product meat = new Product(5, "Meat", 137);
        Product lemonade = new Product(6, "Lemonade", 28);
        Product orange = new Product(7, "Orange", 68);
        Product banana = new Product(8, "Banana", 55);
        Product beer = new Product(9, "Beer", 32);
        Product watter = new Product(10, "Watter", 18);

        productList.add(0, rise);
        productList.add(1, bread);
        productList.add(2, butter);
        productList.add(3, fish);
        productList.add(4, meat);
        productList.add(5, lemonade);
        productList.add(6, orange);
        productList.add(7, banana);
        productList.add(8, beer);
        productList.add(9, watter);

        Iterator <Product>myIterator = new MyIterator();
        myIterator = productList.iterator();
        int price = 0;
        while (myIterator.hasNext()) {
            Product product = myIterator.next();
            product.setPrice(product.getPrice() + product.getPrice() / 10);
        }
        System.out.println(productList);


    }
}
