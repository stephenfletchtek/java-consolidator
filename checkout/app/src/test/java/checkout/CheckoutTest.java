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

    @Test
    public void testOne() {
        assertEquals("aBc", shop.checkout("aBc"), Integer.valueOf(-1));
    }

    @Test
    public void testTwo() {
        assertEquals("-B8x", shop.checkout("-B8x"), Integer.valueOf(-1));
    }

    @Test
    public void testThree() {
        assertEquals("18", shop.checkout(18), Integer.valueOf(-1));
    }

    @Test
    public void testFour() {
        assertEquals("AA", shop.checkout("AA"), Integer.valueOf(100));
    }

    @Test
    public void testFive() {
        assertEquals("ABCD", shop.checkout("ABCD"), Integer.valueOf(115));
    }

    @Test
    public void testSix() {
        assertEquals("AAA", shop.checkout("AAA"), Integer.valueOf(130));
    }

    @Test
    public void testSeven() {
        assertEquals("AAAAAA", shop.checkout("AAAAAA"), Integer.valueOf(260));
    }

    @Test
    public void testEight() {
        assertEquals("AAAA", shop.checkout("AAAA"), Integer.valueOf(180));
    }
}
