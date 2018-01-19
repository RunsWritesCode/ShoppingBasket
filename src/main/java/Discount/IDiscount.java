package Discount;
import basket.*;

import java.util.ArrayList;

public interface IDiscount {

    double applyDiscounts(ArrayList<Item> items, double total);


}
