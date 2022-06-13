package Arrays;

import java.util.Scanner;

public class JavaGrocer {
    public static void main(String[] args) {
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("Welcome to Jasva Grocers.");
        System.out.println("What can I help you find?");
        Scanner sc = new Scanner(System.in);
        String response = sc.next();

        for (int i = 0; i < aisles.length; i++) {
            if(aisles[i].equals(response)) {
                System.out.println("We have " + response + " on index " + i);
                break;
            }
        }
    }
}
