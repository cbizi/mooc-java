import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons = new ArrayList<>();

    public Room() {

    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortest = this.persons.get(0);
        for (Person i : this.persons) {
            if (i.getHeight() < shortest.getHeight()) {
                shortest = i;
            }
        }
        return shortest;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;
    }
}
