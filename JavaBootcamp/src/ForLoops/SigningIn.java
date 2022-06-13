package ForLoops;

import java.util.Scanner;

public class SigningIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "Samantha";
        String pass = "Java<3";

        System.out.println("Welcome to Javagram. Sign in below:");
        System.out.print("Username :");
        String logUser = sc.next();
        System.out.print("Password :");
        String logPass = sc.next();

        while(!logUser.equals(username) || !logPass.equals(pass)) {
            System.out.println("Incorrect. Try again! ");
            System.out.print("Username : ");
            logUser = sc.next();
            System.out.print("Password : ");
            logPass = sc.next();
        }
        System.out.println("Welcome!");
    }
}
