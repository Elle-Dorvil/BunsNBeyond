package Topping;

public class Sauce extends Topping {
   public Sauce (String name) {
       super(name);
   }

   @Override
    public String getType() {
       return "Sauce";
    }

    @Override
    public double getPrice(int size) {
        return 0.0;
}
