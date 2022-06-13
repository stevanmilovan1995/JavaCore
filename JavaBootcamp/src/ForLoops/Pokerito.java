package ForLoops;

import java.util.Scanner;
public class Pokerito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        sc.nextLine();
        System.out.println("It's like Poker, but a lot simpler\n");
        System.out.println(" • There are two players, you and the computer.");
        System.out.println(" • The dealer will give each player one card.");
        System.out.println(" • Then, the dealer will draw five cards (the river)");
        System.out.println(" • The player with the most river matches wins! ");
        System.out.println(" • If the matches are equal, everyone's a winner!\n");
        System.out.println(" • Ready? Type anything if you are.");

        sc.nextLine();
        String yourCard = randomCard();
        System.out.println(yourCard);
        String computerCard = randomCard();
        System.out.println(computerCard);

        System.out.println("Now. the dealer will draw five cards. Press enter to continue.");
        int yourMatches = 0;
        int computerMatches =0;

        for (int i = 1; i <= 5; i++) {
            sc.nextLine();
            String draw = randomCard();

            if (yourCard.equals(draw)){
                yourMatches++;
            }
            if (computerCard.equals(draw)) {
                computerMatches++;
            }

            System.out.println("Card " + i + "\n");
            System.out.println(draw);

        }

        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (yourMatches > computerMatches) {
            System.out.println("You win!");
        } else if (computerMatches > yourMatches) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Everyone wins!");
        }

        sc.close();
    }
    public static String randomCard() {
        double randomNumber = Math.random() * 13;
        randomNumber += 1;
        return switch ((int) randomNumber) {
            case 1 -> "   _____\n" +
                    "  |A _  |\n" +
                    "  | ( ) |\n" +
                    "  |(_'_)|\n" +
                    "  |  |  |\n" +
                    "  |____V|\n";
            case 2 -> "   _____\n" +
                    "  |2    |\n" +
                    "  |  o  |\n" +
                    "  |     |\n" +
                    "  |  o  |\n" +
                    "  |____Z|\n";
            case 3 -> "   _____\n" +
                    "  |3    |\n" +
                    "  | o o |\n" +
                    "  |     |\n" +
                    "  |  o  |\n" +
                    "  |____E|\n";
            case 4 -> "   _____\n" +
                    "  |4    |\n" +
                    "  | o o |\n" +
                    "  |     |\n" +
                    "  | o o |\n" +
                    "  |____h|\n";
            case 5 -> "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            case 6 -> "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
            case 7 -> "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            case 8 -> "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9 -> "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            case 10 -> "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11 -> "   _____\n" +
                    "  |J  ww|\n" +
                    "  | o {)|\n" +
                    "  |o o% |\n" +
                    "  | | % |\n" +
                    "  |__%%[|\n";
            case 12 -> "   _____\n" +
                    "  |Q  ww|\n" +
                    "  | o {(|\n" +
                    "  |o o%%|\n" +
                    "  | |%%%|\n" +
                    "  |_%%%O|\n";
            case 13 -> "   _____\n" +
                    "  |K  WW|\n" +
                    "  | o {)|\n" +
                    "  |o o%%|\n" +
                    "  | |%%%|\n" +
                    "  |_%%%>|\n";
            default -> "This shouldn't get called.";
        };
    }
}
