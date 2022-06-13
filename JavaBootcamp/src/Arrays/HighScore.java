package Arrays;

public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        System.out.print("Here are the scores : ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        int seat = 0;
        int highScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > highScore) {
                highScore = scores[i];
                seat = i;
            }

        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");


    }

    public static int randomNumber() {
        double doubleNumber = Math.random() * 50000;
        int randomInt = (int)doubleNumber;
        return randomInt;

    }
}
