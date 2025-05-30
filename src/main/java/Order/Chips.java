package Order;

import java.util.List;

public class Chips {
    private String flavor;
    private static final double PRICE = 1.25;
    private static final List<String> VALID_FLAVORS = List.of("bbq", "cheddar", "plain");

    public Chips(String flavor) {
        this.flavor = flavor.toLowerCase();
        if (!VALID_FLAVORS.contains(flavor)) {
            throw new IllegalArgumentException("Invalid chips flavor: " + flavor);
        }
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return PRICE;
    }

    public void displayChips() {
        System.out.printf("Chips: %-10s $%.2f/n", getFlavor(), getPrice());
    }
}
