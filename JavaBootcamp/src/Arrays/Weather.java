package Arrays;

public class Weather {
    public static void main(String[] args) {
        double[] celcius = {12.50, 14.50, 17.00, 21.00, 23.00, 18.50, 20.00};
        double[] niz2 = celciusToFahrenheit(celcius);

        printTemperatures(celcius, "Celsius");
        printTemperatures(niz2, "Fahrenheit");
    }

    public static double[] celciusToFahrenheit(double[] niz) {
        double[] fahrenheit = new double[niz.length];
        for (int i = 0; i < niz.length; i++) {
            fahrenheit[i] = (niz[i] / 5 * 9) + 32;
        }
        return fahrenheit;
    }

    public static void printTemperatures(double[] temp, String type) {
        System.out.print(type + ": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(String.format("%.2f", temp[i]) + " ");
        }
        System.out.print("\n");
    }
}
