import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> mapWithAbbreviations;

    public Abbreviations() {
        this.mapWithAbbreviations = new HashMap<>();

    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.mapWithAbbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (mapWithAbbreviations.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (mapWithAbbreviations.containsKey(abbreviation)) {
            return mapWithAbbreviations.get(abbreviation);
        }
        return null;
    }
}

