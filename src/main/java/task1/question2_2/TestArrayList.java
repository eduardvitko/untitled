package task1.question2_2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestArrayList {
    private List<Product> products;

    @Before
    public void setUp(){
       products = new ArrayList<Product>();
    }

    @Test
    public void testListInit(){
        assertTrue(products.isEmpty());
        assertTrue(products.size() == 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCapacity(){
        products = new ArrayList<Product>(-1);
    }
    @Test
    public void addProduct(){
        Product milk = new Product (1,"Milk");
        Product bread = new Product (2,"Bread");
        Product meat = new Product (3,"meat");
        Product butter= new Product (4,"butter");

        products.add(0,milk);
        products.add(1,bread);
        products.add(2,meat);
        products.add(3,butter);

        assertTrue(products.size()==4);
    }
    @Test
    public void removeProduct() {

        Product sugar = new Product (1,"Sugar");
        Product potatoes = new Product (2,"Potatoes");


        products.add(0,sugar);
        products.add(1,potatoes);

        products.remove(sugar);

        assertTrue(products.size()==1);

    }
    @Test
    public void getProductByIndex(){
        Product fish = new Product (1,"Fish");
        Product egg = new Product (2,"Egg");


        products.add(0,fish);
        products.add(1,egg);


        assertEquals(fish, products.get(0));
    }

    @Test
    public void clearListProduct(){
        Product rom = new Product (1,"Rom");
        Product whisky = new Product (2,"Whisky");
        Product jin = new Product (3,"Jin");
        Product bourbon = new Product (4,"Bourbon");

        products.add(0,rom);
        products.add(1,whisky);
        products.add(2,jin);
        products.add(3,bourbon);

        assertTrue(products.size()==4);

        products.clear();

        assertTrue(products.size()==0);
        assertTrue(products.isEmpty());

    }

    @Test
    public void containsProduct(){
        Product rom = new Product (1,"Rom");
        Product whisky = new Product (2,"Whisky");


        products.add(0,rom);
        products.add(1,whisky);


        boolean flag  = products.contains(whisky);

        assertEquals(true, flag);


    }
    @Test
    public  void setProducts(){
        Product rom = new Product (1,"Rom");
        Product whisky = new Product (2,"Whisky");

        products.add(0,rom);
        products.add(1,whisky);

        Product wine = new Product(1, "Wine");

        products.set(1,wine);

        assertEquals(wine, products.get(1));
    }

    @Test
    public void addProductOfIndex(){
        Product juice = new Product (1,"Juice");
        Product cola = new Product (2,"Cola");
        Product sprite = new Product (3,"Sprite");

        products.add(0,juice);
        products.add(1,cola);
        products.add(2,sprite);

        Product lemonade = new Product(4,"Lemonade");

        products.add(1,lemonade);
        assertEquals(lemonade, products.get(1));
        assertEquals(cola, products.get(2));
        assertEquals(sprite, products.get(3));
    }
}
