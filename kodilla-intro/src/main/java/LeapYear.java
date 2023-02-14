import org.jetbrains.annotations.NotNull;

public class LeapYear {
    private static String main(String[] args) {
        String text = "Leap year";
        String text2 = "Non-leap year";
        int numberOfDays = 365;
        if (numberOfDays % 4 == 1) {
            System.out.println(text2);
            return text2;
        } else if (numberOfDays % 4 == 0 && numberOfDays % 100 == 1) {
            System.out.println(text);
            return text;
        } else if (numberOfDays % 4 == 0 && numberOfDays % 100 == 0 && numberOfDays % 400 ==1) {
            System.out.println(text2);
            return text2;
        } else if (numberOfDays % 4 == 0 && numberOfDays % 100 == 0 && numberOfDays % 400 == 0) {
            System.out.println(text); }
        return text;
    }
}