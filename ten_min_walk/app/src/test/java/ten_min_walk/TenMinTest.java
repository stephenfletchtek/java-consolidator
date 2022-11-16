package ten_min_walk;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TenMinTest {
    TenMin tenMin;
    @Before
    public void initialize() {
        tenMin = new TenMin();
    }
    @Test public void testOne() {
        String[] testWalk = { "w", "s", "e", "e", "n", "n", "e", "s", "w", "w" };
        assertTrue("a ten minute walk", tenMin.tenMinuteWalk(testWalk));
    }

    @Test public void testTwo() {
        String[] testWalk = { "w", "s", "e", "n", "n", "e", "s", "w", "w", "w" };
        assertFalse("a ten minute walk", tenMin.tenMinuteWalk(testWalk));
    }

    @Test public void testThree() {
        String[] testWalk = { "w", "s", "e", "s", "s", "e", "s", "w", "n", "n" };
        assertFalse("a ten minute walk", tenMin.tenMinuteWalk(testWalk));
    }

    @Test public void testFour() {
        String[] testWalk = { "w", "s" };
        assertFalse("a ten minute walk", tenMin.tenMinuteWalk(testWalk));
    }
}
