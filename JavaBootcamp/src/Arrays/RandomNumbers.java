package Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        int[][] twoDArray = new int[100][10];



        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = randomNumber();
            }
        }
        print2DArray(twoDArray);
    }

    public static int randomNumber() {
        double randomDouble = Math.random() * 100;
        int randomInt = (int) randomDouble;
        return randomInt;
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
