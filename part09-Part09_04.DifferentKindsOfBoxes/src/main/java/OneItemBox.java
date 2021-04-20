import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> singleBox;

    public OneItemBox() {
        this.singleBox = new ArrayList<>();
    }


    @Override
    public void add(Item item) {
        if (singleBox.isEmpty()) {
            singleBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return singleBox.contains(item);
    }
}
