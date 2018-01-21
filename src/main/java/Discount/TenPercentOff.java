package Discount;

import basket.Item;

import java.util.ArrayList;

public class TenPercentOff implements IDiscount {

    public double applyDiscounts(ArrayList<Item> items, double total) {
        if (total > 20) {
            return total * 0.9;
        }
        return total;
    }

}
