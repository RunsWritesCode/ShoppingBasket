import basket.Basket;
import basket.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;
    Item item1;
    Item item2;
    Item item3;
    Item item4;

    @Before
    public void before() {
        basket = new Basket();
        item1 = new Item("Frog", 4.00);
        item2 = new Item("Dog", 250.00);
        item3 = new Item("baguette", 0.99);
        item4 = new Item("apple", 0.60);
    }

    @Test
    public void basketStartsEmpty() {
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canAddItem() {
        basket.addItem(item2);
        assertEquals(1, basket.itemCount());
    }

    @Test
    public void canRemoveItem() {
        basket.addItem(item1);
        basket.removeItem(item1);
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canEmptyBasket() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.emptyBasket();
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void canGetPrice() {
        basket.addItem(item2);
        assertEquals(250, item2.getPrice(), .01);
    }

    @Test
    public void getTotal() {

    }

    @Test
    public void canCalculateTotalBD() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.calculateTotal();
        assertEquals(254, basket.calculateTotal(), 0.01);
    }

}
