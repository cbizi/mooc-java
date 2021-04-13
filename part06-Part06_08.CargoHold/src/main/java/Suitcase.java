import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if ((this.maximumWeight - item.getWeight()) >= 0) {
            this.items.add(item);
        }
        this.maximumWeight -= item.getWeight();
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Item i : items) {
            weight += i.getWeight();
        }
        return weight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);
        for (Item i : items) {
            if (i.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = i;
            }
        }
        return heaviestItem;
    }

    public String toString() {
        int counter = 0;
        int weight = 0;
        for (Item i : items) {
            counter++;
            weight += i.getWeight();
        }
        if (counter == 0) {
            return "no items (0 kg)";
        }
        if (counter == 1) {
            return "1 item (" + weight + " kg)";
        }
        return counter + " items (" + weight + " kg)";
    }
}
