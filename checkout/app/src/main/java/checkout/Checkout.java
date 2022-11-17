package checkout;

import java.util.ArrayList;

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
        int total = 0;
        if (!validBasket(basket)) {
            return -1;
        }

        for (int i = 0; i < 4; i++) {
            Integer quantity = countItem(basket, itemNames.charAt(i));
            Integer[] item = items.get(i);
            total += quantity * item[0];
            if (item.length == 3 && quantity / item[1] > 0) {
                total -= quantity * item[0] - ((quantity / item[1]) * item[2]);
            }
        }
        return total;
    }

    private Integer countItem(String basket, Character item) {
        int count = 0;
        for (int i = 0; i < basket.length(); i++ ) {
            if (basket.charAt(i) == item) {
                count ++;
            }
        }
        return count;
    }

    private Boolean validBasket(String basket) {
        for (int i = 0; i < basket.length(); i++) {
            if (itemNames.indexOf(basket.charAt(i)) == -1 ) {
                return false;
            }
        }
        return true;
    }
}
