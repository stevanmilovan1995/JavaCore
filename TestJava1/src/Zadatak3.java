public class Zadatak3 {

    public static void main(String[] args) {
      double rez = konvertuj("yuan", "yen", 123);
        System.out.println(rez);
    }

    public static double konvertuj(String uValutu, String izValute, double kolicina) {
        double rezultat = 0;

        if (izValute.equalsIgnoreCase("yuan")) {
            switch (uValutu) {
                case "yen" -> rezultat = kolicina * 19.11;
                case "won" -> rezultat = kolicina * 190.31;
                case "dong" -> rezultat = kolicina * 3461.83;
            }
        }

        if (izValute.equalsIgnoreCase("yen")) {
            switch (uValutu) {
                case "yaun" -> rezultat = kolicina / 19.11;
                case "won" -> rezultat = kolicina * 0;
                case "dong" -> rezultat = kolicina * 3461.83;
            }
        }

        if (izValute.equalsIgnoreCase("won")) {
            switch (uValutu) {
                case "yuan" -> rezultat = kolicina / 190.31;
                case "yen" -> rezultat = kolicina * 0;
                case "dong" -> rezultat = kolicina / 18.19;
            }
        }

        if (izValute.equalsIgnoreCase("dong")) {
            switch (uValutu) {
                case "yuan" -> rezultat = kolicina / 3461.83;
                case "yen" -> rezultat = kolicina * 181.15;
                case "won" -> rezultat = kolicina * 3461.83;
            }
        }

        return rezultat;
    }
}
