
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equalsIgnoreCase("add")) {
                if (amount > 0) {
                    if (first + amount <= 100) {
                        first += amount;
                    } else if (first + amount >= 100) {
                        first = 100;
                    }
                }
            }

            if (command.equalsIgnoreCase("move")) {
                if (amount > 0) {
                    if (first < amount) {
                        second += first;
                        first = 0;
                    } else if (second + amount >= 100) {
                        first -= amount;
                        second = 100;
                    } else {
                        second += amount;
                        first -= amount;
                    }
                }
            }

            if (command.equalsIgnoreCase("remove")) {
                if (amount > 0) {
                    if (amount > second) {
                        second = 0;
                    } else {
                        second -= amount;
                    }
                }
            }
        }
    }
}
