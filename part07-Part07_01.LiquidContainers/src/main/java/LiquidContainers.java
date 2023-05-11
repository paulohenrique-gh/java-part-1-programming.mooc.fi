
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxCapacity = 100;
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + " / " + maxCapacity);
            System.out.println("Second: " + second + " / " + maxCapacity);
            String input = scan.nextLine();
        
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    if ((first == maxCapacity) || (amount <= 0)) {
                        break;
                    } else if (first + amount >= maxCapacity) {
                        first = maxCapacity;
                    } else {
                        first += amount;
                    }
                    break;
                case "move":
                    if ((first == 0) || (amount <= 0)) {
                        break;
                    } else if (first >= amount) {
                        if (second + amount >= maxCapacity) {
                            second = maxCapacity;
                            first -= amount;
                        } else {
                            second += amount;
                            first -= amount;
                        }
                    } else {
                        second += amount - (amount - first);
                        first = 0;
                    }
                    break;
                case "remove":
                    if (second == 0) {
                        break;
                    } else if (amount >= second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
            }
        }

    }
}
