package Topping;

public class Cheese extends Topping {
    public Cheese (String name) {
        super(name);
    }
    @Override
    public String getType() {
        return "Cheese";
    }
}
