import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> bookList = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication Year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Books(title, pages, publicationYear));
        }

        System.out.println("");

        System.out.print("What information will be printed? ");
        String option = scanner.nextLine();

        switch (option) {
            case "name":
                for (Books book : bookList) {
                    System.out.println(book.getTitle());
                }
                break;
            
            case "pages":
                for (Books book : bookList) {
                    System.out.println(book.getPages());
                }
                break;

            case "year of publication":
                for (Books book : bookList) {
                    System.out.println(book.getPublicationYear());
                }
                break;

            case "everything":
                for (Books book : bookList) {
                    System.out.println(book);
                }
                break;

            default:
                System.out.println("Invalid input. The options are: ");
                System.out.println("name");
                System.out.println("pages");
                System.out.println("year of publication");
                System.out.println("everything");
        }
    }
}
