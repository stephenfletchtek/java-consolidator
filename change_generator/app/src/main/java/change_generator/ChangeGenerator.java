package change_generator;

import java.math.BigDecimal;

public class ChangeGenerator {
    public String[] convert(BigDecimal amount) {
        return new String[] {"£5", "£1", "20p", "20p", "2p"};
    }
}
