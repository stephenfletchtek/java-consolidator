package leap_years;

import java.util.ArrayList;

public class LeapYear {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        if (args.length > 0) {
            Integer year = Integer.valueOf(args[0]);
            System.out.println(leapYear.isLeapYear(year));
        }
    }

    public Boolean isLeapYear(Integer year) {
        if (year % 400 == 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 != 0;
    }

    public ArrayList<Integer> leapYearsBetween(Integer start, Integer end) {
        ArrayList<Integer> result = new ArrayList<>();
        if (start % 2 == 0) {
            start++;
        }

        for (int i = start + 1; i < end; i += 2) {
            if (isLeapYear(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public Integer closestLeapYear(Integer date) {
        Integer delta = 0;
        for (int i = 0; i < 8; i++) {
            if (isLeapYear(date + i)) {
                delta = i;
                break;
            } else if (isLeapYear(date - i)) {
                delta = -i;
                break;
            }
        }
        return date + delta;
    }
}
