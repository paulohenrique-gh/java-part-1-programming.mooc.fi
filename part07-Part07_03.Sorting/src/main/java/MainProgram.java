import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            } 
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == smallest(array)) {
                return j;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startingIndex) {
        int smallestIndex = startingIndex;
        for (int k = startingIndex; k < table.length; k++) {
            if (table[k] < table[smallestIndex]) {
                smallestIndex = k;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int l = 0; l < array.length - 1; l++) {
            //smallest index from current index + 1
            int indexOfNextSmallest = indexOfSmallestFrom(array, l + 1);
            if (array[l] > array[indexOfNextSmallest]) {
                swap(array, l, indexOfNextSmallest);
            }
        }
    }
}
