package middle_letters;

public class MiddleLetter {
    public String get_middle(String word) {
        int startPoint = word.length()/2 -1 ;
        StringBuilder middle = new StringBuilder();
        middle.append(word.charAt(startPoint));

        if (word.length() % 2 == 0) {
            middle.append(word.charAt(startPoint + 1));
        }
        return middle.toString();
    }
}
