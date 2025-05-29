package Topping;

public class Cheese extends Topping {
    private boolean extra;


    public Cheese(String name, boolean extra) {
        super(name);
        this.extra = extra;
    }
    @Override
    public String getType() {
        return "Cheese";
    }

    @Override
    public double getPrice(int size) {
        double basePrice = switch (size) {
            case 4 -> 0.75;
            case 8 -> 1.50;
            case 12 -> 2.25;
            default -> 0.0;
        };
        double extraPrice = switch (size) {
            case 4 -> 0.30;
            case 8 -> 0.60;
            case 12 -> 0.90;
            default -> 0.0;
        };
        return extra ? (basePrice + extraPrice) : basePrice;
    }
}
