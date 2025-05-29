package Topping;

public class Sauce extends Topping {
   public Sauce (String type) {
       super(type);
   }

    @Override
    public double getPrice(int size) {
        return 0;
    }
}
