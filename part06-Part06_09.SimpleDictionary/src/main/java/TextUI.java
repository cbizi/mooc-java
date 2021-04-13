import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary words;

    public TextUI(Scanner scanner, SimpleDictionary words) {
        this.scanner = scanner;
        this.words = words;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.words.add(word, translation);
                continue;
            }
            if (input.equals("search")) {
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();
                String translation = this.words.translate(word);

                if (translation == null) {
                    System.out.print("Word " + word + " was not found" + "\n");
                    continue;
                }
                else {
                    System.out.print("Translation: ");
                    System.out.print(this.words.translate(word )+ "\n");
                    continue;
                }
            }
            else {
            System.out.println("Unknown command");
            }
        }
    }
}
