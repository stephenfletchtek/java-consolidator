package change_generator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChangeGeneratorTest {
    @Before
    public void initialize() {
        ChangeGenerator changeGenerator = new ChangeGenerator();
    }

    @Test public void testOne() {
        String[] result = {"£5", "£1", "20p", "20p", "2p"};
        assertEquals("6.42 in money", changeGenerator.convert(6.42), result);
    }
}
