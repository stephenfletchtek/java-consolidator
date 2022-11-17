package checkout;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckoutTest {
    Checkout shop;
    @Before
    public void initialize() {
        shop = new Checkout();
    }
    @Test public void testOne() {
        assertEquals("aBc", shop.checkout("aBc"), Integer.valueOf(-1));
    }
}
