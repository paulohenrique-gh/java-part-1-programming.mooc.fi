import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private BirdList birdList;

    //constructor
    public UserInterface(Scanner scanner, BirdList birdList) {
        this.scanner = scanner;
        this.birdList = birdList;
    }

    //start interface
    public void start() {
        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();

            if (input.equals("Quit")) {
                break;
            }

            if (input.equals("Add")) {
                menuOptionAdd();
            }

            if (input.equals("Observation")) {
                menuOptionObservation();
            }

            if (input.equals("All")) {
                menuOptionAll();
            }

            if (input.equals("One")) {
                menuOptionOne();
            }
        }
    }

    //handles input Add
    public void menuOptionAdd() {
        //get bird name
        System.out.print("Name: ");
        String birdName = scanner.nextLine();
        //get bird latin name
        System.out.print("Name in Latin: ");
        String birdLatinName = scanner.nextLine();

        //create new bird object
        Bird bird = new Bird(birdName, birdLatinName);

        //add it to the birdList
        this.birdList.addBird(bird);
    }

    //handles input Observation
    public void menuOptionObservation() {
        //get bird to add observation to
        System.out.print("Bird? ");
        String observedBird = scanner.nextLine();

        //checks whether it's in the list or not, if true, add 1 to observation count of that bird
        if (this.birdList.contains(observedBird)) {
            int index = this.birdList.getIndex(observedBird);
            this.birdList.getBird(index).setObservationCount();
        } else {
            System.out.println("Not a bird!");
        }
    }

    //handles input All
    public void menuOptionAll() {
        System.out.print(this.birdList);
    }

    //handles input One
    private void menuOptionOne() {
        //get bird to print
        System.out.print("Bird? ");
        String birdToPrint = scanner.nextLine();

        if (this.birdList.contains(birdToPrint)) {
            int index = this.birdList.getIndex(birdToPrint);
            System.out.println(this.birdList.getBird(index)); 
        }
            
    }
}
