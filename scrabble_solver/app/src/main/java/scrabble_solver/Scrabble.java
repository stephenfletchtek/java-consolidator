package scrabble_solver;

import java.util.Objects;

public class Scrabble {
    String word;
    String onePoint = "AaEeIiOoUuLlNnRrSsTt";
    String twoPoints = "DdGg";
    String threePoints = "BbCcMmPp";
    String fourPoints = "FfHhVvWwYy";
    String fivePoints = "Kk";
    String eightPoints = "JjXx";
    String tenPoints = "QqZz";
    Integer score;

    public Scrabble(String word) {
        this.word = word;
        this.score = 0;
    }

    public Integer score() {
        calcScore(1, onePoint);
        calcScore(2, twoPoints);
        calcScore(3, threePoints);
        calcScore(4, fourPoints);
        calcScore(5, fivePoints);
        calcScore(8, eightPoints);
        calcScore(10, tenPoints);
        return this.score;
    }

    private void calcScore(Integer amount, String group) {
        int limit = 0;
        if (this.word != null) {
            limit = this.word.length();
        }
        for (int i = 0; i < limit; i++) {
            char chr = this.word.charAt(i);
            if (group.indexOf(chr) != -1) {
                this.score += amount;
            }
        }
    }
}
