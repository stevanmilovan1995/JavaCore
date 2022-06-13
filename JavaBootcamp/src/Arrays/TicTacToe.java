package Arrays;


import java.util.Scanner;

public class TicTacToe {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[][] ticTacToe = new char[3][3];
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                ticTacToe[i][j] = '_';
            }
        }
        printBoard(ticTacToe);

        for (int i = 0; i < 9; i++) {
            if(i % 2 == 0) {
                System.out.println("Turn: x");
                int[] spot = askUser(ticTacToe);
                ticTacToe[spot[0]][spot[1]] = 'X';
                printBoard(ticTacToe);
            }
            else {
                System.out.println("Turn: O");
                int[] spot = askUser(ticTacToe);
                ticTacToe[spot[0]][spot[1]] = 'O';
                printBoard(ticTacToe);
            }
        }


    }

    public static void printBoard(char[][] board) {
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
        }
    }

    public static int[] askUser(char[][] board) {
        System.out.print(" - pick a row and column number: ");

        int row = sc.nextInt();
        int column = sc.nextInt();

        while (board[row][column] != ('_')){
            System.out.print("Spot taken, try again: ");
            row = sc.nextInt();
            column = sc.nextInt();
        }

        int[] spot = {row, column};
        return spot;
    }
}
