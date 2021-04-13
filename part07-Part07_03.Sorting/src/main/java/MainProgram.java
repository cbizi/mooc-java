import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            i++;
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int length = array.length;
        int i = 0;

        while (i < length) {
            if (array[i] == MainProgram.smallest(array)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array, i), i);
        }
    }
}

