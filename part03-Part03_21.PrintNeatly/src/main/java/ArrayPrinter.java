import java.util.ArrayList;

public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int i = 0;
        for (i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
// getalen printen
// komma toevoegen
// laatste getal zonder komma