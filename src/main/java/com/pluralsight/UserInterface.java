package com.pluralsight;

import Order.Order;
import Sandwich.Sandwich;
import Topping.Meat;
import Topping.Regular;
import Topping.Sauce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Order.Drink;
import Order.Chips;
import Topping.Topping;
import Topping.Cheese;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Order currentOrder = new Order(1001);

    public void displayHomeScreen() {
        int choice;

        do {
            System.out.println("Welcome to BunsNBeyond!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Starting a new order...");
                    createOrder();
                    break;
                case 0:
                    System.out.println("Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice. ");
            }
        } while (choice != 0);
    }

    public void createOrder() {
        currentOrder = new Order(1001);

        boolean ordering = true;

        while (ordering) {
            System.out.println("\nOrder Menu: ");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    currentOrder.displayOrderDetails();
                    System.out.println("Confirm order? (yes/no): ");
                    String confirm = scanner.nextLine().toLowerCase();

                    if (confirm.equals("yes")) {
                        currentOrder.saveReceiptToFile();
                        System.out.println("Thank you! Order complete.\n");
                    }
                    ordering = false;
                    break;
                case 0:
                    cancelOrder();
                    System.out.println("Order canceled. ");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. ");
            }
        }
    }

    private void addSandwich() {
//        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Add a Sandwich---");

        System.out.println("Enter bread type (white, wheat, rye, wrap): ");
        String bread = scanner.nextLine();

        System.out.println("Enter sandwich size (4, 8, 12): ");
        int size = scanner.nextInt();

        System.out.println("Toasted? (y or n): ");
        String toastedInput = scanner.nextLine().toLowerCase();
        boolean isToasted = toastedInput.equals("y");
//        if (scanner.nextBoolean()) isToasted = true;
//        else isToasted = false;
        scanner.nextLine();

        Sandwich sandwich = new Sandwich(bread, size, isToasted);
        List<Topping> selectedToppings = new ArrayList<>();

        while (true) {
            System.out.println("What meat would you like?(steak, ham, salami, roast beef, chicken, bacon). Type 'done' when finished");
            String meat = scanner.nextLine().toLowerCase();
            System.out.println("Add meat: ");
            if (meat.equals("done")) {


                System.out.println("Do you want extra meat? (y or n): ");
                String extraInput = scanner.nextLine().toLowerCase();
                boolean extraMeat = extraInput.equals("y");
                if (extraInput.equalsIgnoreCase("y")) {
                    extraMeat = true;
                    selectedToppings.add(new Meat(meat, extraMeat));
                }
            }
            while (true) {

//            boolean extraMeat = scanner.nextLine();
//            scanner.nextLine();
                System.out.println("Would you like cheese? (american, provolone, swiss, cheddar)");
                String cheese = scanner.nextLine().toLowerCase();

                if (cheese.equals("done")) {

                    System.out.println("Do you want extra cheese? (y or n): ");
                    String extraInput = scanner.nextLine().toLowerCase();
                    boolean extraCheese = extraInput.equals("y");
//            cheese = scanner.nextLine().toLowerCase();

                    selectedToppings.add(new Cheese(cheese, extraCheese));

                    break;
                }
                System.out.println("Add regular toppings (lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms). Type 'done' when finished.");
                while (true) {
                    System.out.println("Add topping: ");
                    String topping = scanner.nextLine().toLowerCase();
                    if (topping.equals("done")) break;
                    selectedToppings.add(new Regular(topping));
                }


                System.out.println("Add sauces (mayo, mustard, ketchup, ranch, thousand islands, vinaigrette");
                while (true) {
                    System.out.println("Add sauce: ");
                    String sauce = scanner.nextLine().toLowerCase();
                    if (sauce.equals("done")) break;
                    selectedToppings.add(new Sauce(sauce));
                }
            }
            break;


        }
        sandwich.setToppings(selectedToppings);
        currentOrder.addSandwich(sandwich);
        System.out.println("Sandwich added!");
    }

        private void addDrink() {
//            Scanner scanner = new Scanner(System.in);
            System.out.println("\n--- Add a Drink---");


            System.out.println("Enter drink size: small, medium, large ");
            String size = scanner.nextLine().toLowerCase();

            System.out.println("What flavor?: Water, Grape, Strawberry, Apple");
            String flavor = scanner.nextLine().toLowerCase();

            List<String> validFlavors = List.of("water", "grape", "strawberry", "apple");
            if (!validFlavors.contains(flavor)) {
                System.out.println("Invalid input. Try again. ");
                return;
            }
            Drink drink = new Drink(flavor, size);
            System.out.println("Added drink: " + size + " " + flavor + drink.calculatePrice());

            currentOrder.addDrink(drink);
        }

        private void addChips() {
            System.out.println("\n--- Add Chips ---");
            System.out.print("Flavor choices (bbq, cheddar, plain): ");
            String inputFlavor = scanner.nextLine();

            try {
                Chips chips = new Chips(inputFlavor);
                System.out.println("Added chips: " + chips.getFlavor());
                System.out.println("Price: $" + chips.getPrice());
                currentOrder.addChips(chips);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }



        public void cancelOrder() {
            System.out.println("Are you sure you want to cancel the order? (y/n): ");
            String confirm = scanner.nextLine().toLowerCase();

            if (confirm.equals("y")) {
                currentOrder.cancelOrder();
            } else {
                System.out.println("Order not canceled. Try again");
            }
        }
    }