import java.util.Scanner;

public class UserInterface {
    private Grades grades;
    private Scanner scanner;

    public UserInterface(Grades grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        inputProcessing();
    }

    public void inputProcessing() {
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if ((input >= 0) && (input <= 100)) {
                this.grades.add(input); // add input to grade list if it's between 0 and 100
            } else if (input == -1) {
                System.out.println("Point average (all): " + this.grades.totalAverage()); // prints average if input is -1
                
                if (this.grades.passingAverage() == 0) {
                    System.out.println("Point average (passing): -");
                } else {
                    System.out.println("Point average (passing): " + this.grades.passingAverage());
                }
                
                System.out.println("Pass percentage: " + grades.passingPercentage());  
                this.grades.gradeDistribution();   
                break;           
            } 
        } 
    }
}
