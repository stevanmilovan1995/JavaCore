package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?");
        int n = sc.nextInt();
        String[] toppings = new String[n];
        System.out.println("Great, enter each topping");

        for (int i = 0; i < toppings.length; i++) {
            toppings[i] = sc.next();
        }
        System.out.println("Thank you! Here are the topping you ordered.");
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + "." + toppings[i]);
        }

        System.out.println("\n Press anything to confirm your order.");
        sc.nextLine();
        sc.nextLine();
        System.out.println("Great, a driver is on the way!");
    }
}
