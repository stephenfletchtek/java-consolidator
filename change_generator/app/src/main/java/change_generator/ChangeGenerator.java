package change_generator;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ChangeGenerator {
    String bigUnit;
    String smallUnit;
    String[] denominations;
    ArrayList<String> toReturn;

    public ChangeGenerator(String bigUnit, String smallUnit, String[] denominations) {
        this.bigUnit = bigUnit;
        this.smallUnit = smallUnit;
        this.denominations = denominations;
        toReturn = new ArrayList<>();
    }
    public String[] convert(BigDecimal amount) {
        for (String denomination : denominations) {
            BigDecimal divisor = new BigDecimal(denomination);
            BigDecimal[] res = amount.divideAndRemainder(divisor);
            for (int i = 0; i < res[0].intValue(); i++) {
                toReturn.add(formatOutput(denomination));
            }
            amount = res[1];
        }
        return toReturn.toArray(new String[0]);
    }

    private String formatOutput(String input) {
        if (input.contains(".")) {
            BigDecimal result = new BigDecimal(input).multiply(new BigDecimal(100));
            return result.intValue() + smallUnit;
        }
        return bigUnit + Integer.valueOf(input);
    }
}
