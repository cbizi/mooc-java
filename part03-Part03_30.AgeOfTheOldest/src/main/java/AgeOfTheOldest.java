
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oudste = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            if (Integer.valueOf(pieces[1]) > oudste) {
                oudste = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + oudste);

    }
}
