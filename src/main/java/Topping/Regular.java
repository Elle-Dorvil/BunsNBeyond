package Topping;

public class Regular extends Topping {
    public Regular (String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Regular";
    }
    @Override
    public  double getPrice(int size) {
        return 0.0;
    }
}
