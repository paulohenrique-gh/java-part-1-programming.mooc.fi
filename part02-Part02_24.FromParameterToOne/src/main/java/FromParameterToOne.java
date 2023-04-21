

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);
    }

    public static void printFromNumberToOne(int lastNumber) {
        for (int i = lastNumber; i > 0; i--){
            System.out.println(i);
        }
    }

}
