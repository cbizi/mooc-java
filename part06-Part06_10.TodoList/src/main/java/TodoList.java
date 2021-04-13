import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list = new ArrayList<>();


    public TodoList() {

    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        int counter = 1;
        for (String i : list) {
            System.out.println(counter + ": " + i);
            counter++;
        }
    }

    public void remove(int number) {
        list.remove(number - 1);
    }
}
