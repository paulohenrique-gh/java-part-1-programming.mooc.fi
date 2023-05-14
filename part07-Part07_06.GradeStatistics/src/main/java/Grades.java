import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> gradesList;

    //Constructor. Creates the main list
    public Grades() {
        this.gradesList = new ArrayList<>();
    }

    //add grade to main list
    public void add(int grade) {
        this.gradesList.add(grade);
    }

    //avarage of all valid grades
    public double totalAverage() {
        int sum = 0;
        for (int grade : gradesList) {
            sum += grade;
        }
        
        return (double) sum / this.gradesList.size() ;
    }

    //generate list of passing grades
    public ArrayList<Integer> passingList() {
        ArrayList<Integer> passingGrades = new ArrayList<>();

        for (int grade : this.gradesList) {
            if (grade >= 50) {
                passingGrades.add(grade);
            }
        }
        return passingGrades;
    }

    //avarage of passing grades
    public double passingAverage() {
        if (this.passingList().isEmpty()) {
            return 0;
        }

        int passingSum = 0;

        for (int grade : this.passingList()) {
            passingSum += grade;
        }

        return (double) passingSum / this.passingList().size();
    }

    //calculate percentage of passing grades
    public double passingPercentage() {
        return 100 * (double) passingList().size() / this.gradesList.size();
    }

    //grade distribution
    public void gradeDistribution() {
        int[] stars = new int[6];
        
        for (int grade : this.gradesList) {
            if (grade < 50) {
                stars[0]++;
            } else if (grade < 60) {
                stars[1]++;
            } else if (grade < 70) {
                stars[2]++;
            } else if (grade < 80) {
                stars[3]++;
            } else if (grade < 90) {
                stars[4]++;
            } else {
                stars[5]++;
            }
        }

        printGradeDistribution(stars);
    }

    //print grade distribution
    public void printGradeDistribution(int[] array) {
        for (int i = array.length; i > 0; i--) {
            System.out.print((i - 1) + ": ");
            for (int j = 0; j < array[i - 1]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

