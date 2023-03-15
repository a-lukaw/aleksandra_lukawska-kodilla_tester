package comm;

import java.util.Scanner;

public class Color {

    public static String nameOfColorByFirstInputLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of color:");
            String firstLetter = scanner.nextLine().trim();
            if (firstLetter.length() == 1) {
                return getColor(firstLetter);
            }
            System.out.println("Type first letter of color");
        }
    }

    public static String getColor(String firstLetter) {
        switch (firstLetter) {
            case "b":
                return "black";
            case "g":
                return "green";
            case "p":
                return "pink";
            case "y":
                return "yellow";
            default:
                return "Type first letter of color";
        }
    }

    public static void main(String[] args) {
        String color = Color.nameOfColorByFirstInputLetter();
        System.out.println("Your color is " + color);
    }

}