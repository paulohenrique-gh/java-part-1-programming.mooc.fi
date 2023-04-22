
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        
        System.out.print("Lower limit? ");
        int lower = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper limit? ");
        int upper = Integer.valueOf(scanner.nextLine());

        printNumbersInRange(numbers, lower, upper);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int value : numbers) {
            if (value >= lowerLimit && value <= upperLimit) {
                System.out.println(value);
            }
        }
    }
}
