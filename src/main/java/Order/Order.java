package Order;

import Sandwich.Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }
    public void addDrink(Chips chip) {
        chips.add(chip);
    }
    public void displayOrderDetails() {
        System.out.println("Order Details: ");
        for (Sandwich s : sandwiches) {
            s.displaySandwich();
        }
        for (Drink d : drinks) {
            d.displayDrink();
        }
        for (Chips c : chips) {
            c.displayChips();
        }
    private void addSandwich() {
            Scanner scanner = new Scanner();
            
            System.out.println("\n--- Add a Sandwich---");

            System.out.println("Enter bread type (white, wheat, rye, wrap): ");
            String bread = scanner.nextLine();

            System.out.println("Enter sandwich size (4, 8, 12): ");
            int size = scanner.nextInt();

            System.out.println("Toasted? (true/false): ");
            boolean isToasted = scanner.nextBoolean();
            scanner.nextLine();

            Sandwich sandwich = new Sandwich(bread, size, isToasted);

            currentOrder.addSandwich(sandwich);

            System.out.println("Sandwich added!");
        }
    }
}
