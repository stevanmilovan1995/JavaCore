public class Zadatak4 {



    public static String najduziStringTriNiza(String[] niz1, String[] niz2, String[] niz3) {
        String najduzi1 = niz1[0];
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i].length() > najduzi1.length()) {
                najduzi1 = niz1[i];
            }
        }

        String najduzi2 = niz2[0];
        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i].length() > najduzi2.length()) {
                najduzi2 = niz1[i];
            }
        }

        String najduzi3 = niz3[0];
        for (int i = 0; i < niz3.length; i++) {
            if (niz3[i].length() > najduzi3.length()) {
                najduzi3 = niz1[i];
            }
        }

        if (najduzi1.length() > najduzi2.length() && najduzi1.length() > najduzi3.length()) {
            return najduzi1;
        } else if (najduzi2.length() > najduzi1.length() && najduzi2.length() > najduzi3.length()) {
            return najduzi2;
        } else
            return najduzi3;
    }
}
