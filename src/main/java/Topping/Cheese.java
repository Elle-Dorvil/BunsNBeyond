package Topping;

public class Cheese extends RegularTopping {
    public Cheese (String type) {
        super(type);
    }
    @Override
    public double getPrice(int size) {
        return 0.50 * (size / 4);
    }
}
