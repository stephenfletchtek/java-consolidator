package change_generator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ChangeGeneratorTest {
    ChangeGenerator changeGenerator;
    @Before
    public void initialize() {
        changeGenerator = new ChangeGenerator();
    }

    @Test public void testOne() {
        BigDecimal amount = new BigDecimal(6.42);
        String[] result = {"£5", "£1", "20p", "20p", "2p"};
        assertArrayEquals("6.42 in money", changeGenerator.convert(amount), result);
    }
}
