package Discount;

import basket.Item;

import java.util.ArrayList;

public class LoyaltyDiscount implements IDiscount {

    public double applyDiscounts(ArrayList<Item> items, double total) {
            return total*0.98;
    }

}
