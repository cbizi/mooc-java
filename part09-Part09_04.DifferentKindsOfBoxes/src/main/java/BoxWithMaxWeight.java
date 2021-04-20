import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> itemsInMaxBox;

    public BoxWithMaxWeight (int capacity) {
        this.capacity = capacity;
        this.itemsInMaxBox = new ArrayList<>();
    }

    public int currentAmount() {
        int sum = 0;

        for (Item i : itemsInMaxBox) {

            sum += i.getWeight();
        }
        return sum;

    }

    @Override
    public void add(Item item) {
        if (currentAmount() + item.getWeight() <= this.capacity) {
            itemsInMaxBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return itemsInMaxBox.contains(item);
    }
}
