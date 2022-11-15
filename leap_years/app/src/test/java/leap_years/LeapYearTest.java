package leap_years;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {
    @Test public void y2kIsLeap() {
        LeapYear leapYear = new LeapYear();
        assertTrue("y2k is a leap year", leapYear.isLeapYear(2000));
    }
}
