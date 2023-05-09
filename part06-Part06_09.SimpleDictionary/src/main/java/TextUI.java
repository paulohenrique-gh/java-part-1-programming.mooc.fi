import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            switch (command) {
                case "add":
                    add();
                    break;
                case "search":
                    search();
                    break;
                default:
                    System.out.println("Unknown command"); 
            }
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        
        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        this.dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String query = scanner.nextLine();

        if (this.dictionary.containsKey(query)) {
            System.out.println("Translation: " + this.dictionary.translate(query));
        } else {
            System.out.println("Word " + query + " was not found");
        }
    }
}
