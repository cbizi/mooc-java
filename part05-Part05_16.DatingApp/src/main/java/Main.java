
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate firstDay = new SimpleDate(1, 1, 2020);
        SimpleDate second = firstDay.afterNumberOfDays(500);
        System.out.println(second);
        SimpleDate tester = new SimpleDate(30, 12, 2000);
        tester.advance();
        System.out.println(tester);
    }
}
