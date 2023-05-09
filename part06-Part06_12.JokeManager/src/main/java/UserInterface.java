import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();

            if ((command.equals("X")) ||
                (command.equals("x"))) {
                break;
            }
        
            processCommand(command);
        }
    }

    public void processCommand(String command) {
        
        switch (command) {
            case "1":
                add();
                break;
            case "2":
                draw();
                break;
            case "3":
                list();
        }
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }

    public void draw() {
        System.out.println(this.jokeManager.drawJoke());
    }

    public void list() {
        this.jokeManager.printJokes();
    }
}
