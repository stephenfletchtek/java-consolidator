package change_generator;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ChangeGenerator {
    String[] divisors;
    String[] output;
    ArrayList<String> toReturn;

    public ChangeGenerator() {
        divisors = new String[] { "20", "10", "5", "1", "0.2", "0.1", "0.02"};
        output = new String[] { "£20", "£10", "£5", "£1", "20p", "10p", "2p"};
        toReturn = new ArrayList<>();
    }
    public String[] convert(BigDecimal amount) {
        for (int j = 0; j < divisors.length; j++) {
            BigDecimal divisor = new BigDecimal(divisors[j]);
            BigDecimal[] res = amount.divideAndRemainder(divisor);
            for (int i = 0; i < res[0].intValue(); i++) {
                toReturn.add(output[j]);
            }
            amount = res[1];
        }
        return toReturn.toArray(new String[0]);
    }
}
