import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] niz = new int[5];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        for (int i = 0; i < niz.length; i++) {
            System.out.println(i + 1  + ". " + niz[i] + " ");
        }
    }
}
