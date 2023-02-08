public class LeapYear {
    private static String main(String[] args) {
        String text = "Rok przestepny";
        int firstNumber = 365;
        int secondNumber = 366;
        boolean rokPrzestepny = true;
            if (firstNumber%4 == 1){
                System.out.println("Rok nieprzestępny"); }
            else if (secondNumber%4 == 0) {
                System.out.println("Rok przestępny)"); }
            if (firstNumber%100 == 0) {
                System.out.println("Rok przestępny"); }
            return text;

            }
    }
