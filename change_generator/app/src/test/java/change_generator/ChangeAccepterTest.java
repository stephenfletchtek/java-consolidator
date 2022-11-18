package change_generator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeAccepterTest {
    ChangeAccepter changeAccepter;
    @Before
    public void initialize() {
        changeAccepter = new ChangeAccepter("£");
    }

    @Test public void testOne() {
        String[] input = {"£5", "£1", "20p", "20p", "2p"};
        String output = "£6.42";
        assertEquals("currency to 6.42", changeAccepter.deposit(input), output);
    }

    @Test public void testTwo() {
        String[] input = {"£20", "£20"};
        String output = "£40.00";
        assertEquals("currency to 40", changeAccepter.deposit(input), output);
    }

    @Test public void testThree() {
        String[] input = {"£10", "£5", "£1", "20p", "10p"};
        String output = "£16.30";
        assertEquals("currency to 16.30", changeAccepter.deposit(input), output);
    }

    @Test public void testFour() {
        String[] input = {"£10", "£5", "£2", "£2", "50p", "20p", "20p", "5p", "2p", "2p"};
        String output = "£19.99";
        assertEquals("currency to 19.99", changeAccepter.deposit(input), output);
    }

    @Test public void testFive() {
        String[] input = {"£50", "£20", "£5", "£1", "50p", "20p", "10p", "1p"};
        String output = "£76.81";
        assertEquals("currency to 76.81", changeAccepter.deposit(input), output);
    }
}
