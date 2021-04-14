public class Container {

    int value;
    int max;

    public Container() {
        this.value = 0;
        this.max = 100;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.value + amount >= this.max) {
                this.value = 100;
            } else {
                this.value += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.value - amount <= 0) {
                this.value = 0;
            } else {
                this.value -= amount;
            }
        }
    }

    public String toString() {
        return this.value + "/" + this.max;
    }
}
