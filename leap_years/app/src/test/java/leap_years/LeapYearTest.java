package leap_years;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LeapYearTest {
    LeapYear leapYear;
    @Before
    public void initialize() {
        leapYear = new LeapYear();
    }

    @Test public void isLeap2000() {
        assertTrue("y2k is a leap year", leapYear.isLeapYear(2000));
    }

    @Test public void isLeap1970() {
        assertFalse("1970 is a leap year", leapYear.isLeapYear(1970));
    }

    @Test public void isLeap1900() {
        assertFalse("1900 is a leap year", leapYear.isLeapYear(1900));
    }

    @Test public void isLeap1988() {
        assertTrue("1988 is a leap year", leapYear.isLeapYear(1988));
    }

    @Test public void isLeap1500() {
        assertFalse("1500 is a leap year", leapYear.isLeapYear(1500));
    }

    @Test public void leapYearsBetween() {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1992);
        assertEquals("Between 1988 and 1996", leapYear.leapYearsBetween(1988, 1996), result);
    }

    @Test public void between1900and1920() {
        ArrayList<Integer> result = new ArrayList<>();
        String[] years = { "1904", "1908", "1912", "1916" };
        for (String year : years) {
            result.add(Integer.valueOf(year));
        }
        assertEquals("Between 1900 and 1920", leapYear.leapYearsBetween(1900, 1920), result);
    }

    @Test public void closestTo1989() {
        assertEquals("Nearest to 1989 is 1988", leapYear.closestLeapYear(1989), Integer.valueOf(1988));
    }

    @Test public void closestTo1500() {
        assertEquals("Nearest to 1500 is 1504", leapYear.closestLeapYear(1500), Integer.valueOf(1504));
    }
}
