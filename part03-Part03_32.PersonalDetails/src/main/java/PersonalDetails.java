
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int longestLength = 0;
        int sum = 0;
        int count = 0;
        
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splitInput = input.split(",");
            int year = Integer.valueOf(splitInput[1]);
            int nameLength = splitInput[0].length();

            if (nameLength > longestLength) {
                longestLength = nameLength;
                longestName = splitInput[0];
            }

            sum += year;
            count++;
            
        }

        double average = (double) sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Avarage of the birth years: " + average);
    }
}
