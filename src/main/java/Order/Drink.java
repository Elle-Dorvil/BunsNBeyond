package Order;

public class Drink {
    private String flavor;
    private String size;;

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

//    public String addDrink() {
//        return addDrink();
//    }

    public double calculatePrice() {
        switch (size.toLowerCase()) {
            case "small" : return 2.00;
            case "medium" : return  2.50;
            case "large" : return  3.00;
            default : return  0.0;
        }
    }
    public void displayDrink() {
        System.out.printf("Drink: %-10s (%s) $%.2f\n ", flavor, size, calculatePrice());
    }
}
