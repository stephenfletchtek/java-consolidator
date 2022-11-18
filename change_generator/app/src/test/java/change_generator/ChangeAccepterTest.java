package change_generator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ChangeAccepterTest {
    ChangeAccepter changeAccepter;
    @Before
    public void initialize() {
        changeAccepter = new ChangeAccepter();
    }

    @Test public void testOne() {
        String[] input = {"£5", "£1", "20p", "20p", "2p"};
        String output = "£6.42";
        assertEquals("currency to 6.42", changeAccepter.deposit(input), output);
    }

//    @Test public void testTwo() {
//        BigDecimal amount = new BigDecimal(40);
//        String[] result = {"£20", "£20"};
//        assertArrayEquals("40 in money", changeGenerator.convert(amount), result);
//    }
//
//    @Test public void testThree() {
//        BigDecimal amount = new BigDecimal("16.30");
//        String[] result = {"£10", "£5", "£1", "20p", "10p"};
//        assertArrayEquals("16.30 in money", changeGenerator.convert(amount), result);
//    }
//
//    @Test public void testFour() {
//        BigDecimal amount = new BigDecimal("19.99");
//        String[] result = {"£10", "£5", "£2", "£2", "50p", "20p", "20p", "5p", "2p", "2p"};
//        assertArrayEquals("19.99 in money", changeGenerator.convert(amount), result);
//    }
//
//    @Test public void testFive() {
//        BigDecimal amount = new BigDecimal("76.81");
//        String[] result = {"£50", "£20", "£5", "£1", "50p", "20p", "10p", "1p"};
//        assertArrayEquals("76.81 in money", changeGenerator.convert(amount), result);
//    }
}
