package task1.question2_2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class TestArrayList {
    private List<Product> products;

    @Before
    public void setUp() {
        products = new ArrayList<Product>();
    }

    @Test
    public void testListInit() {
        assertTrue(products.isEmpty());
        assertTrue(products.size() == 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCapacity() {
        products = new ArrayList<Product>(-1);
    }

    @Test
    public void addProduct() {
        Product milk = new Product(1, "Milk");
        Product bread = new Product(2, "Bread");
        Product meat = new Product(3, "meat");
        Product butter = new Product(4, "butter");

        products.add(0, milk);
        products.add(1, bread);
        products.add(2, meat);
        products.add(3, butter);

        assertTrue(products.size() == 4);
    }

    @Test
    public void removeProduct() {

        Product sugar = new Product(1, "Sugar");
        Product potatoes = new Product(2, "Potatoes");


        products.add(0, sugar);
        products.add(1, potatoes);

        products.remove(sugar);

        assertTrue(products.size() == 1);

    }

    @Test
    public void getProductByIndex() {
        Product fish = new Product(1, "Fish");
        Product egg = new Product(2, "Egg");


        products.add(0, fish);
        products.add(1, egg);


        assertEquals(fish, products.get(0));
    }

    @Test
    public void clearListProduct() {
        Product rom = new Product(1, "Rom");
        Product whisky = new Product(2, "Whisky");
        Product jin = new Product(3, "Jin");
        Product bourbon = new Product(4, "Bourbon");

        products.add(0, rom);
        products.add(1, whisky);
        products.add(2, jin);
        products.add(3, bourbon);

        assertTrue(products.size() == 4);

        products.clear();

        assertTrue(products.size() == 0);
        assertTrue(products.isEmpty());

    }

    @Test
    public void containsProduct() {
        Product rom = new Product(1, "Rom");
        Product whisky = new Product(2, "Whisky");


        products.add(0, rom);
        products.add(1, whisky);


        boolean flag = products.contains(whisky);

        assertEquals(true, flag);


    }

    @Test
    public void setProducts() {
        Product rom = new Product(1, "Rom");
        Product whisky = new Product(2, "Whisky");

        products.add(0, rom);
        products.add(1, whisky);

        Product wine = new Product(1, "Wine");

        products.set(1, wine);

        assertEquals(wine, products.get(1));
    }

    @Test
    public void addProductOfIndex() {
        Product juice = new Product(1, "Juice");
        Product cola = new Product(2, "Cola");
        Product sprite = new Product(3, "Sprite");

        products.add(0, juice);
        products.add(1, cola);
        products.add(2, sprite);

        Product lemonade = new Product(4, "Lemonade");

        products.add(1, lemonade);
        assertEquals(lemonade, products.get(1));
        assertEquals(cola, products.get(2));
        assertEquals(sprite, products.get(3));
    }

    @Test
    public void removeProductOfIndex() {
        Product beer = new Product(1, "Beer");
        Product cola = new Product(2, "Cola");
        Product sprite = new Product(3, "Sprite");

        products.add(0, beer);
        products.add(1, cola);
        products.add(2, sprite);

        Product product = products.remove(1);

        boolean flag = cola.equals(products.get(1));


        assertEquals(false, flag);
    }

    @Test
    public void indexOfProduct() {
        Product orange = new Product(1, "Orange");
        Product apple = new Product(2, "Apple");
        Product banana = new Product(3, "Banana");

        products.add(0, orange);
        products.add(1, apple);
        products.add(2, banana);

        int i = products.indexOf(orange);
        boolean flag = orange.equals(products.get(0));

        assertTrue(flag);
        assertEquals(0, i);
    }

    @Test
    public void addAllProducts() {
        Product lemon = new Product(1, "Lemon");
        Product apple = new Product(2, "Apple");
        Product banana = new Product(3, "Banana");

        products.add(0, lemon);
        products.add(1, apple);
        products.add(2, banana);

        List<Product> newList = new ArrayList<>();
        assertTrue(newList.size() == 0);
        assertTrue(newList.isEmpty());

        newList.addAll(products);
        assertTrue(newList.size() == 3);
        assertEquals(newList.get(0), lemon);
        assertEquals(newList.get(1), apple);
        assertEquals(newList.get(2), banana);

    }

    @Test
    public void removeAllProducts() {
        Product grapeFruit = new Product(1, "GrapeFruit");
        Product apple = new Product(2, "Apple");
        Product banana = new Product(3, "Banana");

        products.add(0, grapeFruit);
        products.add(1, apple);
        products.add(2, banana);

        assertTrue(products.size() == 3);

        products.removeAll(products);

        assertTrue(products.size() == 0);
        assertTrue(products.isEmpty());
    }

    @Test
    public void retainAllProducts() {
        List<Product> fruit = new ArrayList<>();
        Product cherry = new Product(1, "Cherry");
        Product aiwa = new Product(2, "Aiwa");
        Product banana = new Product(3, "Banana");

        fruit.add(0, cherry);
        fruit.add(1, aiwa);
        fruit.add(2, banana);

        List<Product> food = new ArrayList<>();
        Product burger = new Product(1, "Burger");
        Product cheese = new Product(2, "Cheese");
        Product meat = new Product(3, "Meat");

        food.add(burger);
        food.add(cheese);
        food.add(meat);

        List<Product> list = new ArrayList<>();
        list.addAll(food);

        boolean flag = food.retainAll(fruit);
        assertTrue(flag);

        flag= food.retainAll(list);
        assertFalse(flag);

    }
    @Test
    public void Iterator(){
        List<Product> macFoods = new ArrayList<>();
        Product burger = new Product(1, "Burger");
        Product cheese = new Product(2, "Cheese");
        Product meat = new Product(3, "Meat");

        macFoods.add(burger);
        macFoods.add(cheese);
        macFoods.add(meat);


        Iterator<Product> iterator = macFoods.iterator();
        int counts = 0;
        while (iterator.hasNext()){
           iterator.next();
           counts++;
        }

        assertTrue(counts==macFoods.size());
        assertEquals(macFoods.size(),counts);
    }

}
