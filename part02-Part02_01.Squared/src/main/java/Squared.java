
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = Integer.valueOf(scanner.nextLine());
        int square = userInput * userInput;

        System.out.println(square);

    }
}
