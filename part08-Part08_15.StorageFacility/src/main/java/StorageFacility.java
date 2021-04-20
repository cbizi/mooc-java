import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }


    public void remove (String storageUnit, String item) {
        ArrayList<String> items = storage.get(storageUnit);
        items.remove(item);
        if (items.isEmpty()) {
            storage.remove(storageUnit);
        }
    }


    public ArrayList<String> storageUnits() {
        ArrayList<String> filledUnits = new ArrayList<>();
        for (String units : this.storage.keySet()) {
            if (!units.isEmpty()) {
                filledUnits.add(units);
            }
        }
        return filledUnits;
    }
}
