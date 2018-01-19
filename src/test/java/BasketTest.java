import basket.Basket;
import basket.Item;
import org.junit.Before;

public class BasketTest {

    Basket basket;
    Item item;
    Item item2;
    Item item3;
    Item item4;

    @Before
    public void before() {
        basket = new Basket();
        item = new Item("Frog", 4.00);
        item2 = new Item("Dog", 250.00);
        item3 = new Item("baguette", 0.99);
        item4 = new Item("apple", 0.60);
    }



}
