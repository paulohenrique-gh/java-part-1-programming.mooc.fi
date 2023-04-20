
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());
        int number = 0;

        while (number <= input) {
            System.out.println(number);
            number++;
        }

    }
}
