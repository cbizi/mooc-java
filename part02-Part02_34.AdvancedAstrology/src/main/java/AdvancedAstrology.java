
public class AdvancedAstrology {

    public static void printStars(int number) {
        int printed = 0;
        while (printed < number) {
            System.out.print("*");
            printed++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int printed = 0;
        while (printed < number) {
            System.out.print(" ");
            printed++;
        }
    }

    public static void printTriangle(int size) {
        int row = 1;
        while (row <= size) {
            printSpaces(size-row);
            printStars(row);
            row++;
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(i * 2 - 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
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
