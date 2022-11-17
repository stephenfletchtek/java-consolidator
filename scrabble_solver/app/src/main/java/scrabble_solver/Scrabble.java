package scrabble_solver;

import java.util.HashMap;

public class Scrabble {
    private final String word;
    private Integer score;
    private final HashMap<Integer, String> scoreMap;

    public Scrabble(String word) {
        scoreMap = new HashMap<>();
        String[] letters = {
                "AaEeIiOoUuLlNnRrSsTt",
                "DdGg",
                "BbCcMmPp",
                "FfHhVvWwYy",
                "Kk",
                "JjXx",
                "QqZz"
        };
        Integer[] scores = {1, 2, 3, 4, 5, 8, 10};
        for (int i = 0; i < letters.length ; i++) {
            scoreMap.put(scores[i], letters[i]);
        }
        this.word = word;
        this.score = 0;
    }

    public Integer score() {
        for (Integer key : scoreMap.keySet()) {
            calcScore(key, scoreMap.get(key));
        }
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
