import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable i : herd) {
            i.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String newString = "";
        for (Movable i : herd) {
            newString += i.toString().trim() + "\n";
        }
        return newString;
    }

}
