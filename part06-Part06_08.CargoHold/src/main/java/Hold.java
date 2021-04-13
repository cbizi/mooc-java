import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> holds = new ArrayList<>();

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.maximumWeight - suitcase.totalWeight()) >= 0) {
            this.holds.add(suitcase);
        }
        this.maximumWeight -= suitcase.totalWeight();
    }

    public void printItems() {
        for (Suitcase i : holds) {
            i.printItems();
        }
    }

    public String toString() {
        int counter = 0;
        int weight = 0;
        for (Suitcase i : holds) {
            counter++;
            weight += i.totalWeight();
        }
        return counter + " suitcases (" + weight + " kg)";
    }
}
