package checkout;

import java.util.ArrayList;
import java.util.Objects;

public class Checkout {
    private final ArrayList<Integer[]> items;
    private final String itemNames;

    public Checkout() {
        items = new ArrayList<>();
        items.add(new Integer[] {50, 3, 130});
        items.add(new Integer[] {30, 2, 45});
        items.add(new Integer[] {20});
        items.add(new Integer[] {15});
        itemNames = "ABCD";
    }
    public Integer checkout(Integer basket) {
        return -1;
    }
    public Integer checkout(String basket) {
        Integer total = 0;
        if (!validBasket(basket)) {
            return -1;
        }

        for (int i = 0; i < 4; i++) {
            Integer quantity = countItem(basket, itemNames.charAt(i));
            total += quantity * items.get(i)[0];
        }

        return total;
    }

    private Integer countItem(String basket, Character item) {
        Integer count = 0;
        for (int i = 0; i < basket.length(); i++ ) {
            if (basket.charAt(i) == item) {
                count ++;
            }
        }
        return count;
    }

    private Boolean validBasket(String basket) {
        for (int i = 0; i < basket.length(); i++) {
            if ("ABCD".indexOf(basket.charAt(i)) == -1 ) {
                return false;
            }
        }
        return true;
    }
}
