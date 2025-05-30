package Order;

public class Chips {
    private String brand;

    public Chips(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return 1.50;
    }

    public void displayChips() {
        System.out.printf("Chips: %-10s $%.2f/n", getBrand(), getPrice());
    }
}
