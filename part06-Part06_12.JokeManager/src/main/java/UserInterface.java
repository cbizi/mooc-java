import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = this.scanner.nextLine();
            if (input.equalsIgnoreCase("x")) {
                break;
            }

            if (Integer.valueOf(input) == 1) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.manager.addJoke(joke);
            }
            if (Integer.valueOf(input) == 2) {
                this.manager.drawJoke();
            }
            if (Integer.valueOf(input) == 3) {
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
            }
        }
    }
}
