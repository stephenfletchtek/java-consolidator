package leap_years;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {
    @Test public void isLeap2000() {
        LeapYear leapYear = new LeapYear();
        assertTrue("y2k is a leap year", leapYear.isLeapYear(2000));
    }

    @Test public void isLeap1970() {
        LeapYear leapYear = new LeapYear();
        assertFalse("1970 is a leap year", leapYear.isLeapYear(1970));
    }

    @Test public void isLeap1900() {
        LeapYear leapYear = new LeapYear();
        assertFalse("1900 is a leap year", leapYear.isLeapYear(1900));
    }
}
