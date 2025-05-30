package Sandwich;

import Topping.Topping;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String bread;
    private int size;
    private boolean isToasted;
//    private boolean extraMeat;
//    private boolean extraCheese;
    private List<Topping> toppings;

    public Sandwich(String bread, int size, boolean isToasted) {
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

//    public Sandwich(String bread, int size, boolean isToasted, List<Topping> toppings) {
//        this.bread = bread;
//        this.size = size;
//        this.isToasted = isToasted;
//        this.extraMeat = extraMeat;
//        this.extraCheese = extraCheese;
//        this.toppings = new ArrayList<>();
//    }

//    public Sandwich(String bread, int size, boolean isToasted) {
//    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

//    public boolean isExtraMeat() {
//        return extraMeat;
//    }
//
//    public void setExtraMeat(boolean extraMeat) {
//        this.extraMeat = extraMeat;
//    }
//
//    public boolean isExtraCheese() {
//        return extraCheese;
//    }
//
//    public void setExtraCheese(boolean extraCheese) {
//        this.extraCheese = extraCheese;
//    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
    public void displaySandwich() {
        System.out.println("---- Sandwich ----");
        System.out.printf("%d\" %s sandwich %s\n", size, bread, (isToasted ? "(toasted)" : ""));

        for (Topping t : toppings) {
            System.out.printf("- %-10s: %-15s $%.2f\n",  t.getType(), t.getName(), t.getPrice(size));
            }
        System.out.printf("Subtotal: $%.2f\n", getPrice());
        System.out.println("------------------\n");
        }

    public double getPrice() {
        double base = switch (size) {
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0.0;
        };

        double toppingTotal = 0.0;
        for (Topping t : toppings) {
            toppingTotal += t.getPrice(size);
        }
        return base + toppingTotal;
    }
}


