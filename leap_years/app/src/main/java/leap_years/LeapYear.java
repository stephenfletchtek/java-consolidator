package leap_years;

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
}
