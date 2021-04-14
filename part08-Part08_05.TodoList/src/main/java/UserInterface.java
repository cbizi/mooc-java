import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            if (input.equalsIgnoreCase("add")) {
                System.out.print("To add: ");
                list.add(scanner.nextLine());
                continue;
            }

            if (input.equalsIgnoreCase("list")) {
                list.print();
                continue;
            }

            if (input.equalsIgnoreCase("remove")) {
                System.out.print("Which one is removed? ");
                list.remove(Integer.valueOf(scanner.nextLine()));
                continue;
            }
        }
    }
}
