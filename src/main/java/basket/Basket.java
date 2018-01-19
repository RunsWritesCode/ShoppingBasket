package basket;

import Discount.IDiscount;

import java.util.ArrayList;

public class Basket {

    public ArrayList<Item> items;
    public ArrayList<IDiscount> discounts;

    public Basket() {

        items = new ArrayList<Item>();
        discounts = new ArrayList<IDiscount>();

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

    public int calculateTotalBeforeDiscount(){
        int i = 0;
        for(Item item : items){
            i += item.getPrice();
        }
        return i;
    }

    public int calculateTotalAfterDiscount() {
       
    }

}
