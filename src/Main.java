import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testFile.test();
        //custom input
        testCustomInputs();
    }

    private static void testCustomInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (scanner.hasNextInt()) {
            int intValue = scanner.nextInt();
            System.out.println("Roman Numeral for " + intValue + " is " + intToRoman.intToRoman(intValue));
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }


        scanner.close();
    }

}