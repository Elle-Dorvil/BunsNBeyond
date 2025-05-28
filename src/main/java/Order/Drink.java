package Order;

public class Drink {
    private String flavor;
    private int size;

    public Drink(String flavor, int size) {
        this.flavor = flavor;
        this.size = size;
    }
    public void displayDrink() {
        System.out.println("Drink: " + flavor + "(" + size + ")");
    }
}
