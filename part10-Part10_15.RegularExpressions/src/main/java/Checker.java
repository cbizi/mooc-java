
public class Checker {

    public Checker() {
    }

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is correct");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }

    public boolean allVowels(String string) {
        if (string.matches("(a|e|i|o|u)*")) {
            System.out.println("The form is correct");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }

    public boolean timeOfDay(String string) {
  /*      String[] parts = string.split(":");
        String hours = parts[0];
        String minutes = parts[1];
        String seconds = parts[2];
        if (hours.matches("[01][0-9]|2[0-3]")
                && minutes.matches("[0-5][0-9]")
                && seconds.matches("[0-5][0-9]")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }*/

        if (string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
}


