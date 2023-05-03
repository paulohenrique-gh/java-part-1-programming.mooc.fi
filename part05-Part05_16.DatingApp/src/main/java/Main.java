
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // test your program here!

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a date starting with the day:");
        int day = Integer.valueOf(scanner.nextLine());
        System.out.println("Month:");
        int month = Integer.valueOf(scanner.nextLine());
        System.out.println("Year:");
        int year = Integer.valueOf(scanner.nextLine());

        SimpleDate date = new SimpleDate(day, month, year);
        System.out.println("Today is " + date);

        System.out.println("How many days do you want to advance?");
        int daysToAdvance = Integer.valueOf(scanner.nextLine());
        System.out.println("How many times?");
        int howManyTimes = Integer.valueOf(scanner.nextLine());

        SimpleDate newDate = date.afterNumberOfDays(daysToAdvance);
        int daysPassed = 0;

        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("After 20 days it will be " + newDate);
            newDate = newDate.afterNumberOfDays(daysToAdvance);
            daysPassed += daysToAdvance;
        }

        System.out.println("A total of " + daysPassed + " days have passed");
    }
}