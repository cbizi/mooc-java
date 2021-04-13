
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int printed = 0;
            while (printed < array[i]) {
                System.out.print("*");
                printed++;
            }
            System.out.println("");
        }
    }
}
