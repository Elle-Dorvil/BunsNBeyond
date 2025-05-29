package Topping;

public class Meat extends Topping {
    private boolean extra;


    public Meat(String name, boolean extra) {
        super(name);
        this.extra = extra;
    }
    @Override
    public String getType() {
        return "Meat";
    }
    @Override
    public double getPrice(int size) {
        double basePrice = switch (size) {
            case 4 -> 1.00;
            case 8 -> 2.00;
            case 12 -> 3.00;
            default -> 0.0;
        };
        double extraPrice = switch (size) {
            case 4 -> 0.50;
            case 8 -> 1.00;
            case 12 -> 1.50;
            default -> 0.0;
        };
        return extra ? (basePrice + extraPrice) : basePrice;
    }
}
