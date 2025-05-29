package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Order currentOrder = new Order();

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
        } while (choice !=0);
    }

    public void createOrder() {
        currentOrder = new Order();

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
                    System.out.println("Thank you! Order complete.\n");
                    ordering = false;
                    break;
                case 0:
                    System.out.println("Order canceled. ");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. ");
            }
        }
    }

}
