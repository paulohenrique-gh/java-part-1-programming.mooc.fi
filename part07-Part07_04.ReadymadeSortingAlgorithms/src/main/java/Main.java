import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] integerArray = {3, 1, 5, 99, 3, 12};
        String[] stringArray = {"banana", "apple", "guava"};
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        integerArrayList.add(2);
        integerArrayList.add(25);
        integerArrayList.add(12);
        integerArrayList.add(3);
        integerArrayList.add(1);
        integerArrayList.add(9);

        stringArrayList.add("key");
        stringArrayList.add("bum");
        stringArrayList.add("lump");

        System.out.println("Before: " + Arrays.toString(integerArray));
        sort(integerArray);
        System.out.println("After: " + Arrays.toString(integerArray));

        System.out.println("Before: " + Arrays.toString(stringArray));
        sort(stringArray);
        System.out.println("After: " + Arrays.toString(stringArray));

        System.out.println("Before: " + integerArrayList);
        sortIntegers(integerArrayList);
        System.out.println("After: " + integerArrayList);

        System.out.println("Before: " + stringArrayList);
        sortStrings(stringArrayList);
        System.out.println("After: " + stringArrayList);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
