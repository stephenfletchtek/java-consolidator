package middle_letters;

public class MiddleLetter {
    public String get_middle(String word) {
        int startPoint = word.length()/2;
        StringBuilder middle = new StringBuilder();
        if (word.length() % 2 == 0) {
            middle.append(word.charAt(startPoint - 1));
        }
        middle.append(word.charAt(startPoint));

        return middle.toString();
    }
}
