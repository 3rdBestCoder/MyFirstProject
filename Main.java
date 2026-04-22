


import java.util.Scanner;

class Order {
    String drinkName;
    double basePrice;
    double discount = 0.10;

    public void printInfo(String drinkName, double basePrice, double finalPrice) {
        System.out.println("Drink: " + drinkName);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Discount: 10.0 %");
        System.out.println("Final Price: $" + finalPrice);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Order order = new Order();

        // Membership
        System.out.print("Are you a café member (Y/N)? ");
        char member = in.next().toUpperCase().charAt(0);

        // Menu
        System.out.println("1. Espresso ($3.50)");
        System.out.println("2. Latte ($4.50)");
        System.out.println("3. Cappuccino ($5.00)");
        System.out.print("Enter your choice (1-3): ");
        int choice = in.nextInt();

        // Determine drink + price
        if (choice == 1) {
            order.drinkName = "Espresso";
            order.basePrice = 3.50;
        } else if (choice == 2) {
            order.drinkName = "Latte";
            order.basePrice = 4.50;
        } else if (choice == 3) {
            order.drinkName = "Cappuccino";
            order.basePrice = 5.00;
        } else {
            System.out.println("Please select a valid number 1–3");
            return;
        }

        // Discount
        double discountPercent = (member == 'Y') ? 0.10 : 0.0;
        double finalPrice = order.basePrice - (order.basePrice * discountPercent);

        // Print results using your method
        order.printInfo(order.drinkName, order.basePrice, finalPrice);
    }
}