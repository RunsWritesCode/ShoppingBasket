//import Discount.BOGOF;
import Discount.IDiscount;
//import Discount.LoyaltyDiscount;
import Discount.TwentyPercentOff;
import basket.Basket;
import basket.Item;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DiscountTest {

    Basket basket;
    Item item1;
    Item item2;
    Item item3;
    Item item4;
    IDiscount twentypercentoff;
    IDiscount loyaltyDiscount;
    IDiscount bOGOF;

    @Before
    public void before() {
        basket = new Basket();
        item1 = new Item("Frog", 4.00);
        item2 = new Item("Dog", 250.00);
        item3 = new Item("baguette", 0.99);
        item4 = new Item("apple", 0.60);
        twentypercentoff = new TwentyPercentOff();
//        loyaltyDiscount = new LoyaltyDiscount();
//        bOGOF = new BOGOF();
    }

    @Test
    public void canApply20PercentOff() {
        basket.addItem(item2);
        basket.calculateTotalAfterDiscount();
        assertEquals(200, basket.calculateTotalAfterDiscount(), 0.01);
    }
}