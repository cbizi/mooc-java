
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oudste = 0;
        String naam = " ";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            if (Integer.valueOf(pieces[1]) > oudste) {
                oudste = Integer.valueOf(pieces[1]);
                naam = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + naam);
    }
}
