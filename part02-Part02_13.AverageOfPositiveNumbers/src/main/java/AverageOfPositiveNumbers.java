
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int positiveSum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input > 0) {
                positiveCount = positiveCount + 1;
                positiveSum = positiveSum + input;
            } else if (input < 0) {
                continue;
            } else {
                break;
            }
        }

        if (positiveCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) positiveSum / positiveCount);
        }

    }
}
