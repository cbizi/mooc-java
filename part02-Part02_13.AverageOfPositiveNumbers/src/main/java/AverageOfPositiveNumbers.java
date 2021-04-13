
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                sum = sum + num;
                count = count + 1;
            }

            if (num < 0) {
                continue;
            }
        }

        if (sum > 0) {
            double average = (double) sum/count;
            System.out.println(average);
        } else if (sum == 0) {
            System.out.println("Cannot calculate the average");
        }
    }
}
