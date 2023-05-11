
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.print("> ");

            System.out.println("First: " + container);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] brokenCommand = input.split(" ");
            String command = brokenCommand[0];
            int amount = Integer.valueOf(brokenCommand[1]);

            switch (command) {
                case "add":
                    container.add(amount);
                    break;
                case "move":
                    container.move(amount, container2);
                    break;
                case "remove":
                    container2.remove(amount);
            }
            
        }
    }

}
