package Order;

public class Chips {
    private String flavor;

    public Chips(String flavor) {
        this.flavor = flavor;
    }
    public void displayChips() {
        System.out.println("Chips: " + flavor);
    }
}
