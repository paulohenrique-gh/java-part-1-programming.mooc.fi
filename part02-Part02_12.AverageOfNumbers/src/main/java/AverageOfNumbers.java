
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        int sum = 0;
        

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input != 0) {
                numbers = numbers + 1;
                sum = sum + input;
            } else {
                break;
            }
        }

        System.out.println("Average of the numbers: " + (double) sum / numbers);

    }
}
