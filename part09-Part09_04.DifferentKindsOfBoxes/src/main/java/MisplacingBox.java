import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> Box;

    public MisplacingBox() {
        this.Box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.Box.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
