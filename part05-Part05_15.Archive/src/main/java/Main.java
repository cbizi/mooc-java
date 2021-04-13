import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> itemList = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item archiver = new Item(id, name);
            if(!itemList.contains(archiver)) {
                itemList.add(archiver);
            }

        }
        System.out.println("==Items==");
        for (Item items : itemList) {
            System.out.println(items);
        }
    }
}
