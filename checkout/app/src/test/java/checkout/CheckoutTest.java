package checkout;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckoutTest {
    @Before public void initialize() {
        Shop shop = new Shop();
    }
    @Test public void testOne() {
        assertEquals("aBc", shop.checkout("aBc"), Integer.valueOf(-1));
    }
}
