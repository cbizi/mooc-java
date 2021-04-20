import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private final HashMap<LicensePlate, String> licensePlateMap = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (licensePlateMap.get(licensePlate) == null) {
            licensePlateMap.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return licensePlateMap.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (licensePlateMap.containsKey(licensePlate)) {
            licensePlateMap.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plates : licensePlateMap.keySet()) {
            System.out.println(plates);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<>();
        for (String owner : licensePlateMap.values()) {
            if (!ownersList.contains(owner)) {
                ownersList.add(owner);
                System.out.println(owner);
            }
        }
    }
}

