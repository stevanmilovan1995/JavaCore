package Arrays;

import java.util.Arrays;

public class RingAnnouncer {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];

        for (int i = 0; i < price.length; i++) {
            afterTax[i] = price[i] + 0.13 * price[i];
        }
        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(afterTax));

    }
}
