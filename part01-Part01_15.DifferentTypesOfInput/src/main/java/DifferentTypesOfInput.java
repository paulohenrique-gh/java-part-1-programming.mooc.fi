
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String stringAnswer = scan.nextLine();
        System.out.println("Give an integer:");
        int intAnswer = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubleAnswer = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanAnswer = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + stringAnswer);
        System.out.println("You gave the integer " + intAnswer);
        System.out.println("You gave the double " + doubleAnswer);
        System.out.println("You gave the boolean " + booleanAnswer);

    }
}
