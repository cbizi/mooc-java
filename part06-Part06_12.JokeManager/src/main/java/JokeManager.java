/*
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        }

        System.out.println("Drawing a joke.");
        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        String joke = jokes.get(index);
        System.out.println(jokes.get(index));
        return joke;
    }

    public void printJokes() {
        for (String i : jokes) {
            System.out.println(i);
        }

    }
}
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeManager {

    private final List<String> jokes = new ArrayList<>();

    public JokeManager() {
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        System.out.println(jokes.get(new Random().nextInt(jokes.size())));
        return jokes.get(new Random().nextInt(jokes.size()));
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}