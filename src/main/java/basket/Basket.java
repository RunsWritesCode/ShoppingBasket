package basket;

import Discount.IDiscount;

import java.util.ArrayList;

public class Basket {

    public ArrayList<Item> items;
    public ArrayList<IDiscount> discounts;
    public double total;

    public Basket() {

        items = new ArrayList<Item>();
        discounts = new ArrayList<IDiscount>();
        total = 0;

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

    public int calculateTotal(){
        int total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }

    public double calculateTotalAfterDiscount() {
        double subTotal = calculateTotal();
        return subTotal * 0.9;
    }

    public void addDiscount(IDiscount discount){
        this.discounts.add(discount);
    }

}
