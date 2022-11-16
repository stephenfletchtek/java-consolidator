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
}
