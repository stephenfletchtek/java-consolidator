package change_generator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ChangeAccepter {
    BigDecimal total;
    String currency;

    public ChangeAccepter(String currency) {
        this.currency = currency;
        total = new BigDecimal(0);
    }
    public String deposit(String[] input) {
        for (String item : input) {
            total = total.add(toBigDecimal(item));
        }
        return formatOutput(total);
    }

    private BigDecimal toBigDecimal(String input) {
        if (!"1234567890".contains(input.substring(0, 1))) {
            return new BigDecimal(input.substring(1));
        }
        BigDecimal pence = new BigDecimal(input.substring(0, input.length() - 1));
        return pence.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
    }

    private String formatOutput(BigDecimal total) {
        total = total.setScale(2, RoundingMode.HALF_UP);
        return currency + total;
    }
}
