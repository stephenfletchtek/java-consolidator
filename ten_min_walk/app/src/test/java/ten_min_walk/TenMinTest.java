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
        assertTrue("app should have a greeting", tenMin.tenMinuteWalk(testWalk));
    }
}
