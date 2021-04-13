
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics userStats = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input != -1) {
                if (input % 2 == 0) {
                    even.addNumber(input);
                }
                if (input % 2 != 0) {
                    odd.addNumber(input);
                }
                userStats.addNumber(input);
            }
            if (input == -1) {
                break;
            }

        }
        System.out.println("Sum: " + userStats.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
