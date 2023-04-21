
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int j = 0;
        while (j < number) {
            System.out.print(" ");
            j++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int k = 0;
        int l = 1;
        while (k < size) {
            printSpaces(size - l);
            printStars(l);
            l++;
            k++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int m = 0;
        int row = 1;
        while (m < height) {
            printSpaces(height - row);
            printStars(row + (row - 1));
            m++;
            row++;
        }
        int n = 0;
        while (n < 2) {
            printSpaces(height - 2);
            printStars(3);
            n++;
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
