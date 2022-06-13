import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] niz = new int[n];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
            if(i % 2 == 0) {
                System.out.println(niz[i]);
            }
        }
    }
}
