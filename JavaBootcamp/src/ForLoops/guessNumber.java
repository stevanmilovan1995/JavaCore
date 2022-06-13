package ForLoops;

import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = sc.nextByte();
        System.out.print("hi guess number from 1 to 5 :");
        int n = sc.nextInt();

        while(secret != n) {
            System.out.println("Guess again:");
            n = sc.nextInt();
        }
        System.out.println("You got it!");
    }
}
