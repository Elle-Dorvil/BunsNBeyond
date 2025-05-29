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
    public double getPrice
}
