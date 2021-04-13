

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int num) {
        int count = num;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
    }

}

