import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {

    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Gift i : this.gifts) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
}