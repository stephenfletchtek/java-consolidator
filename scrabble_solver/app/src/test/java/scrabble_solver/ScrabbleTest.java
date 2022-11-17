package scrabble_solver;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScrabbleTest {
    @Test public void appHasAGreeting() {
        Scrabble scrabble = new Scrabble("");
        assertEquals("blank string", scrabble.score(), Integer.valueOf(0));
    }
}
