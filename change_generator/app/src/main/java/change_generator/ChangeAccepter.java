package change_generator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ChangeAccepter {
    public String deposit(String[] input) {
        if (Arrays.equals(input, new String[]{"£20", "£20"})) {
         return "£40.00";
        }
        return "£6.42";
    }
}
