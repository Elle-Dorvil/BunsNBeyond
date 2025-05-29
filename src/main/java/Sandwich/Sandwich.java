package Sandwich;

import Topping.Topping;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String bread;
    private int size;
    private boolean isToasted;
    private boolean extraMeat;
    private boolean extraCheese;
    private List<Topping> toppings;

    public Sandwich(String bread, int size, boolean isToasted, boolean extraMeat, boolean extraCheese) {
        this.bread = bread;
        this.size = size;
        this.isToasted = isToasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
        this.toppings = new ArrayList<>();
    }

    public Sandwich(String bread, int size, boolean isToasted) {
    }

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

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
    public void displaySandwich() {
        System.out.println(size + "\" " + bread + " sandwich " + (isToasted ? "(toasted" : "(not toasted)"));
        
        if (!toppings.isEmpty()) {
            System.out.println("Toppings: ");
            for (Topping t : toppings) {
                System.out.println("-" + t.getType() + ": " + t.getName());
            }
        } else {
            System.out.println("No toppings selected. ");
        }

        System.out.println();
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
