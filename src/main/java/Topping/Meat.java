package Topping;

public class Meat extends RegularTopping {
    public Meat(String type) {
        super(type);
    }
    @Override
    public double getPrice(int size) {
        return 0.75 * (size / 4);
    }
}
