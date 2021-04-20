import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changes = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changes.add(initialBalance);
    }

    public String history() {
        return changes.toString();
    }

    @Override
    public void addToWarehouse(double amount) {

        double result = 0;

        result = (double) super.getBalance() + amount;

        changes.add(result);
        //histroy to be added



        super.addToWarehouse(amount);



    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = 0;

        result = (double) super.getBalance() - amount;


        //the difference is added not just the amount

        changes.add(result);




        return super.takeFromWarehouse(amount);

    }


    public void printAnalysis(){

        System.out.println("Product: " + this.getName());

        System.out.println("History: " + changes.toString());

        System.out.println("Largest amount of product: " + changes.maxValue());

        System.out.println("Smallest amount of product:" + changes.minValue());

        System.out.println("Average: " + changes.average());


    }
}
