package scrabble_solver;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScrabbleTest {
    @Test public void testOne() {
        Scrabble scrabble = new Scrabble("");
        assertEquals("blank string", scrabble.score(), Integer.valueOf(0));
    }

    @Test public void testTwo() {
        Scrabble scrabble = new Scrabble("\t\n");
        assertEquals("tab and new line", scrabble.score(), Integer.valueOf(0));
    }

    @Test public void testThree() {
        Scrabble scrabble = new Scrabble(null);
        assertEquals("null", scrabble.score(), Integer.valueOf(0));
    }

    @Test public void testFour() {
        Scrabble scrabble = new Scrabble("a");
        assertEquals("letter a", scrabble.score(), Integer.valueOf(1));
    }

    @Test public void testFive() {
        Scrabble scrabble = new Scrabble("f");
        assertEquals("letter f", scrabble.score(), Integer.valueOf(4));
    }

    @Test public void testSix() {
        Scrabble scrabble = new Scrabble("street");
        assertEquals("street", scrabble.score(), Integer.valueOf(6));
    }

    @Test public void testSeven() {
        Scrabble scrabble = new Scrabble("quirky");
        assertEquals("quirky", scrabble.score(), Integer.valueOf(22));
    }

    @Test public void testEight() {
        Scrabble scrabble = new Scrabble("OXYPHENBUTAZONE");
        assertEquals("OXYPHENBUTAZONE", scrabble.score(), Integer.valueOf(41));
    }
}
