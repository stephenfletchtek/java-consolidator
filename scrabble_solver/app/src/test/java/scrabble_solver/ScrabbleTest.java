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
}
