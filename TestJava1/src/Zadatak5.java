public class Zadatak5 {
    public static void main(String[] args) {
        String poruka = xProcenatY(16,25);
        System.out.println(poruka);
    }

    public static long dupliFaktorijel(long n) {
        long dupliFakt = 1;
        for (long i = n; i > 1 ; i-= 2) {
            dupliFakt *= i;
        }
        return dupliFakt;
    }

    public static String xProcenatY(int x, int y) {
        int percentage = x * y / 100;
        int percentage2 = y * x / 100;
        String poruka;

        if(percentage > percentage2) {
            poruka = x + " % " + y +" je veca od " + y + " % " + x;
        }
        else if (percentage == percentage2) {
            poruka = x + " % " + y +" je jednako od " + y + " % " + x;
        } else {
            poruka = x + " % " + y +" je manje " + y + " % " + x;
        }
        return poruka;
    }

    public static void prvihNFibonaci(int n) {
        int prviBroj = 0;
        int drugiBroj = 1;
        int treciBroj = 0;

        for (int i = 0; i < n; i++) {
            treciBroj += prviBroj;
            prviBroj = drugiBroj;
            drugiBroj = treciBroj;
            System.out.print(treciBroj + " ");
        }
    }
}
