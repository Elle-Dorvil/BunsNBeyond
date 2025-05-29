package Topping;

public class Regular extends Topping {
    public Regular (String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Regular";
    }
}
