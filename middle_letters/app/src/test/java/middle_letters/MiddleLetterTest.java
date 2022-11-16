package middle_letters;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MiddleLetterTest {
    MiddleLetter middleLetter;

    @Before
    public void initialize() {
        middleLetter = new MiddleLetter();
    }
    @Test public void middleOfTest() {
        assertEquals("middle of test is es", middleLetter.get_middle("test"), String.valueOf("es"));
    }

    @Test public void middleOfTesting() {
        assertEquals("middle of testing is t", middleLetter.get_middle("testing"), String.valueOf("t"));
    }

    @Test public void middleOfMiddle() {
        assertEquals("middle of middle is dd", middleLetter.get_middle("middle"), String.valueOf("dd"));
    }

    @Test public void middleOfA() {
        assertEquals("middle of A is A", middleLetter.get_middle("A"), String.valueOf("A"));
    }

    @Test public void middleOfof() {
        assertEquals("middle of of is of", middleLetter.get_middle("of"), String.valueOf("of"));
    }
}
