package comm;

public class LeapYear {
    public boolean isLeapYear(int yearToCheck) {
        if (yearToCheck % 4 == 0) {
            if (yearToCheck % 100 == 0) {
                if (yearToCheck % 400 == 0) {
                    return true;

                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}