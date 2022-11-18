package change_generator;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ChangeGenerator {
    String[] divisors;
    ArrayList<String> toReturn;

    public ChangeGenerator() {
        divisors = new String[] {"50", "20", "10", "5", "2", "1", "0.5", "0.2", "0.1", "0.05", "0.02", "0.01"};
        toReturn = new ArrayList<>();
    }
    public String[] convert(BigDecimal amount) {
        for (String str : divisors) {
            BigDecimal divisor = new BigDecimal(str);
            BigDecimal[] res = amount.divideAndRemainder(divisor);
            for (int i = 0; i < res[0].intValue(); i++) {
                toReturn.add(formatOutput(str));
            }
            amount = res[1];
        }
        return toReturn.toArray(new String[0]);
    }

    private String formatOutput(String input) {
        if (input.contains(".")) {
            BigDecimal result = new BigDecimal(input).multiply(new BigDecimal(100));
            return result.intValue() + "p";
        }
        return "£" + Integer.valueOf(input);
    }
}
