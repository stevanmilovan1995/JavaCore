package ForLoops;

import java.util.Scanner;

public class RollingJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start.");
        sc.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println(" - If you roll a 6 the game stops.");
        System.out.println(" - If you roll a 4 nothing happens.");
        System.out.println(" - Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");


        int score = 0;
        while(true) {
            sc.nextLine();
            double diceRoll = rollDice(1,6);
            System.out.println("You rolled a " + diceRoll + " .");
            if(diceRoll == 6) {
                System.out.println("End of game!");
                break;
            }
            else if(diceRoll == 4) {
                System.out.println("Zero points. Keep rolling.");

            } else {
                score++;
                System.out.println("One point. Keep rolling.");
            }
        }


        System.out.println("Your score is : " + score);
        if(score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose.");
        }
    }

    public static double rollDice(double min, double max) {
        double randomNumber;
        return randomNumber =  Math.floor(Math.random() * (max - min + 1) + min);
    }
}
