package Order;

public class Chips {
    private String flavor;

    public Chips(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return 1.50;
    }

    public void displayChips() {
        System.out.printf("Chips: %-10s $%.2f/n", flavor, getPrice());
    }
}
