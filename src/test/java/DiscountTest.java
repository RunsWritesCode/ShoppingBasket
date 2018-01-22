import Discount.IDiscount;
import Discount.LoyaltyDiscount;
import Discount.TenPercentOff;
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
    IDiscount tenpercentoff;
    IDiscount loyaltyDiscount;

    @Before
    public void before() {
        basket = new Basket();
        item1 = new Item("Frog", 4.00);
        item2 = new Item("Dog", 250.00);
        item3 = new Item("baguette", 0.99);
        item4 = new Item("apple", 0.60);
        tenpercentoff = new TenPercentOff();
        loyaltyDiscount = new LoyaltyDiscount();
    }

    @Test
    public void canApply10PercentOff() {
        basket.addItem(item2);
        basket.calculateTotalAfterDiscount();
        assertEquals(225, basket.calculateTotalAfterDiscount(), 0.01);
    }

    @Test
    public void canApplyLoyaltyDiscount() {
        basket.addItem(item2);
        basket.addDiscount(loyaltyDiscount);
        basket.calculateTotalAfterDiscount();
        assertEquals(245, basket.calculateTotalAfterDiscount(), 0.01);
    }


}