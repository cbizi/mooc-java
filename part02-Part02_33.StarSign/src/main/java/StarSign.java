
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");

        printStars(3);
    }

    public static void printStars(int number) {
        int printed = 0;
        while (printed < number) {
            System.out.print("*");
            printed++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int printed = 0;
        while (printed < size) {
            printStars(size);
            printed++;
        }
    }

    public static void printRectangle(int width, int height) {
        int printed = 0;
        while (printed < height) {
            printStars(width);
            printed++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        int printed = 0;
        while (printed <= size) {
            printStars(i);
            i++;
            printed++;
        }
    }
}
