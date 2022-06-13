public class Zadatak2 {

    public static double ar(double[] niz) {
        double suma = 0;
        for (double v : niz) {
            suma += v;
        }
        if (niz.length > 0) {
            return suma / niz.length;

        } else
            return 0;
    }

    public static double gm(double[] niz) {
        double proizvod = 1;
        for (double v : niz) {
            proizvod *= v;
        }
        if (niz.length > 0) {
            return Math.pow(proizvod, 1.0 / niz.length);
        } else
            return 0;
    }

    public static double hm(double[] niz) {
        double suma = 0;
        double harmonijski;
        for (double v : niz) {
            suma += 1 / v;
        }
        if(niz.length > 0) {
            return harmonijski = niz.length / suma;
        }
        else
            return 0;
    }
    
    public static String kojuSredinuKoristiti(double[] niz) {
        String veci ="";
        if(ar(niz) > gm(niz) && ar(niz) > hm(niz)) {
            veci = "AR";
        }
        else if(gm(niz) > ar(niz) && gm(niz) > hm(niz)) {
            veci =  "GM";
        } else if (hm(niz) > ar(niz) && hm(niz) > gm(niz)) {
            veci = "HM";
        } else if (ar(niz) == gm(niz) && ar(niz) == hm(niz)) {
            veci = "Nebitno";
        }
        return veci;
    }
}
