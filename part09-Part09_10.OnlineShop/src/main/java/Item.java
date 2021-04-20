public class Item {

    private String name;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    public String toString() {
        return this.name + ": " + this.qty;
    }
}
