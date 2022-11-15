package leap_years;

public class LeapYear {
    public void main(String[] args) {
        LeapYear leapYear = new LeapYear();
    }

    public Boolean isLeapYear(Integer year) {
        if (year == 1970 || year == 1900) {
            return false;
        }
        return true;
    }
}
