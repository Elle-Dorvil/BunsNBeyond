package Order;

public class Drink {
    private String flavor;
    private String size;
    private double price;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.size = size.toLowerCase();
        this.price = calculatePrice(size);
        System.out.println("DEBUG: Created drink size=" + this.size + ", price=" + price);
    }

    public double getPrice() {
        return price;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getSize() {
        return size;
    }

//    public String addDrink() {
//        return addDrink();
//    }

    public double calculatePrice(String size) {
        switch (size.toLowerCase()) {
            case "small" : return 2.00;
            case "medium" : return  2.50;
            case "large" : return  3.00;
            default : return  0.0;
        }
    }
    public void displayDrink() {
        System.out.printf("Drink: %-10s (%s) $%.2f\n ", flavor, size, price);
    }
}
