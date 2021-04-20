
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("n")) {
            double averageOfNegative = numbers.stream()
                    .mapToInt(n -> Integer.valueOf(n))
                    .filter(n -> n < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + averageOfNegative);
        }
        if (choice.equalsIgnoreCase("p")) {
            double averageOfPositive = numbers.stream()
                    .mapToInt(n -> Integer.valueOf(n))
                    .filter(n -> n > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + averageOfPositive);
        }
    }
}
