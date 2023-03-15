package comm;

public class LeapYearMain {
    public static void main(String[] args) {
        LeapYear xyz = new LeapYear();
        boolean isLeapYear = xyz.isLeapYear(2001);
        System.out.println(isLeapYear);
        if (isLeapYear) {
            System.out.println("Rok przestepny");
        } else {
            System.out.println("Rok nieprzestępny");
        }
    }
}
