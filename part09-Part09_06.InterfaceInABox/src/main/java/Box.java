import java.util.ArrayList;

public class Box implements Packable{

    private double maxWeight;
    private ArrayList<Packable> itemsInBox;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Packable item) {
        if (item.weight() + weight() <= maxWeight) {
            itemsInBox.add(item);
        }
    }

    public String toString() {
        return "Box: " + itemsInBox.size() + " items, total weight " + weight() + " kg";
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : itemsInBox) {
            weight += item.weight();
        }
        return weight;
    }
}
