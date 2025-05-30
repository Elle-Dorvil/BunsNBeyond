package Order;

import Sandwich.Sandwich;
import Topping.Topping;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();
    private List<Topping> toppings;

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void displayOrderDetails() {
        System.out.println("\n===== Order Details =====\n ");
        for (Sandwich s : sandwiches) {
            s.displaySandwich();
        }
        for (Drink d : drinks) {
            d.displayDrink();
        }
        for (Chips c : chips) {
            c.displayChips();
        }

        System.out.printf("\nTotal: $%.2f\n", getTotalPrice());
        System.out.println("==========================\n");
    }

    public double getTotalPrice() {
            double total = 0.0;

            for (Sandwich s : sandwiches) {
                total += s.getPrice();
            }

            for (Drink d : drinks) {
                total += d.getPrice();
            }

            for (Chips c : chips) {
                total += c.getPrice();
            }

            return total;
        }
    public void saveReceiptToFile() {
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        String filename = "receipts/" + timeStamp + ".txt";
        List<Sandwich> selectedSandwich = new ArrayList<>();

        try {
            java.io.File folder = new java.io.File("receipts");
            if (!folder.exists()) {
                folder.mkdir();
            }

            FileWriter writer = new FileWriter(filename);
            writer.write("====== Order Receipt ======\n\n");

            for (Sandwich s : sandwiches) {
                writer.write(s.getSize() + "\" " + s.getBread() + " sandwich " + (s.isToasted() ? "(toasted)\n" : "(not toasted)\n"));
                for (Topping t : toppings) {
                    writer.write(" - " + t.getType() + ": " + t.getName() + " $" + String.format("%.2f", t.getPrice(s.getSize())) + "\n");
                }
                writer.write("Subtotal: $" + String.format("%.2f", s.getPrice()) + "\n\n");
            }
            for (Drink d : drinks) {
                writer.write("Drink: " + d.getFlavor() + "(" + d.getSize() + ") $" + String.format("%.2f", d.getPrice()) + "\n");
            }
            for (Chips c : chips) {
                writer.write(String.format(String.format("Chips: " + c.getBrand() + " $" + String.format("%.2f", c.getPrice()) + "\n")));
            }
            writer.write("\nTotal: $" + String.format("%.2f", getTotalPrice()) +"\n");
            writer.write("============================\n");

            writer.close();
            System.out.println("Receipt saved as: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing receipt: " + e.getMessage());
        }
    }

}
