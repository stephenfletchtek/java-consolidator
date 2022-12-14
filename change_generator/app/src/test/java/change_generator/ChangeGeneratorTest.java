package change_generator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ChangeGeneratorTest {
    ChangeGenerator changeGenerator;
    @Before
    public void initialize() {
        String[] denominations = {"50", "20", "10", "5", "2", "1", "0.5", "0.2", "0.1", "0.05", "0.02", "0.01"};
        changeGenerator = new ChangeGenerator("£", "p", denominations);
    }

    @Test public void testOne() {
        BigDecimal amount = new BigDecimal("6.42");
        String[] result = {"£5", "£1", "20p", "20p", "2p"};
        assertArrayEquals("6.42 in money", changeGenerator.convert(amount), result);
    }

    @Test public void testTwo() {
        BigDecimal amount = new BigDecimal(40);
        String[] result = {"£20", "£20"};
        assertArrayEquals("40 in money", changeGenerator.convert(amount), result);
    }

    @Test public void testThree() {
        BigDecimal amount = new BigDecimal("16.30");
        String[] result = {"£10", "£5", "£1", "20p", "10p"};
        assertArrayEquals("16.30 in money", changeGenerator.convert(amount), result);
    }

    @Test public void testFour() {
        BigDecimal amount = new BigDecimal("19.99");
        String[] result = {"£10", "£5", "£2", "£2", "50p", "20p", "20p", "5p", "2p", "2p"};
        assertArrayEquals("19.99 in money", changeGenerator.convert(amount), result);
    }

    @Test public void testFive() {
        BigDecimal amount = new BigDecimal("76.81");
        String[] result = {"£50", "£20", "£5", "£1", "50p", "20p", "10p", "1p"};
        assertArrayEquals("76.81 in money", changeGenerator.convert(amount), result);
    }

    @Test public void testSixUSA() {
        String[] usDenominations = {"100", "50", "20", "10", "5", "2", "1", "0.5", "0.25", "0.1", "0.05", "0.01"};
        ChangeGenerator usChangeGenerator = new ChangeGenerator("$", "¢", usDenominations);
        BigDecimal amount = new BigDecimal("76.81");
        String[] result = {"$50", "$20", "$5", "$1", "50¢", "25¢", "5¢", "1¢"};
        assertArrayEquals("76.81 in money", usChangeGenerator.convert(amount), result);
    }
}
