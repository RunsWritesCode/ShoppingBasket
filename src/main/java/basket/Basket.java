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

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void emptyBasket() {
        this.items.clear();
    }

}
