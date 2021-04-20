import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> warehouse;
    private Map<String, Integer> balance;

    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.balance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.warehouse.put(product, price);
        this.balance.put(product, stock);
    }

    public int price(String product) {
        return this.warehouse.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.balance.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.stock(product) > 0)  {
            this.balance.put(product, balance.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return this.warehouse.keySet();
    }
}

/*
* reduces the stock remaining for the product it received as a parameter by one,
* and returns true if there was stock remaining.
* If the product was not available in the warehouse the method returns false.
* A products stock can't go below zero. */