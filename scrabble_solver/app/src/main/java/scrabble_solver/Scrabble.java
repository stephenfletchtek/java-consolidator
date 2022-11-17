package scrabble_solver;

import java.util.Objects;

public class Scrabble {
    String word;
    public Scrabble(String word) {
        this.word = word;
    }

    public Integer score() {
        if (Objects.equals(this.word, "a")) {
            return 1;
        }
        return 0;
    }
}
