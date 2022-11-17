package checkout;

import java.util.Objects;

public class Checkout {
    private Integer[] A;
    private Integer[] B;
    private Integer[] C;
    private Integer[] D;

    public Checkout() {
        A = new Integer[] {50, 3, 130};
        B = new Integer[] {30, 2, 45};
        C = new Integer[] {20};
        D = new Integer[] {15};
    }
    public Integer checkout(Integer basket) {
        return -1;
    }
    public Integer checkout(String basket) {
        Integer total = 0;
        if (!validBasket(basket)) {
            return -1;
        }
        
        total = countItem(basket, "A") * A[0];

        return total;
    }

    private Integer countItem(String basket, String item) {
        Integer count = 0;
        for (int i = 0; i < basket.length(); i++ ) {
            if (basket.charAt(i) == item.charAt(0)) {
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
