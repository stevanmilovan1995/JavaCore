import java.util.Arrays;

public class Zadatak1 {
    public static void main(String[] args) {
        String[] niz1 = {"Rosalina", "Peach", "Zelda", "Lucina", "Daisy", "Midna"};
        boolean rez = princezaUZamku(niz1);
        System.out.println(rez);
    }


    public static boolean princezaUZamku(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if(niz[i].equalsIgnoreCase("peach") || niz[i].equalsIgnoreCase("daisy")) {
                return true;
            }
        }
        return false;
    }
}
