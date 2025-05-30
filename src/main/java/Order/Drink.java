package Order;

public class Drink {
    private String flavor;
    private String size;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.size = size.toLowerCase();
    }

    public String getFlavor() {
        return flavor;
    }

    public String getSize() {
        return size;
    }

    public String addDrink() {
        return addDrink();
    }

    public double getPrice() {
        return switch (size) {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0.0;
        };
    }
    public void displayDrink() {
        System.out.printf("Drink: %-10s (%s) $%.2f\n ", flavor, size, getPrice());
    }
}
