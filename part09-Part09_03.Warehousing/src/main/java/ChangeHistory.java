import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory() {

        this.changes = new ArrayList<>();

    }

    public void add(double status) {

        changes.add(status);

    }

    public void clear() {

        changes.clear();

    }

    public double maxValue() {

        if (changes.isEmpty()) {
            return 0.0;
        }

        return Collections.max(changes);

    }

    public double minValue() {

        if (changes.isEmpty()) {
            return 0.0;
        }

        return  1.0 * Collections.min(changes);

    }

    public double average() {
        int sum = 0;

        if (changes.isEmpty()) {
            return sum;
        }

        for (double e : changes) {
            sum += e;

        }

        return 1.0 * sum / changes.size();
    }

    @Override
    public String toString() {

        return changes.toString();

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.changes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChangeHistory other = (ChangeHistory) obj;
        if (!Objects.equals(this.changes, other.changes)) {
            return false;
        }
        return true;
    }
}
