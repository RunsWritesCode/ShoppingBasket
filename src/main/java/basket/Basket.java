package basket;

import Discount.IDiscount;

import java.util.ArrayList;

public class Basket {

    public ArrayList<Item> items;

    public Basket() {

        items = new ArrayList<Item>();

    }

    public int itemCount() {
        return this.items.size();
    }

}
