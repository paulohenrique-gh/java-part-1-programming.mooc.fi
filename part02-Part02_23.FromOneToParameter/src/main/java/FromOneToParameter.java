

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);
    }

    public static void printUntilNumber(int lastNumber) {
        for (int i = 1; i <= lastNumber; i++) {
            System.out.println(i);
        }
    }

}
