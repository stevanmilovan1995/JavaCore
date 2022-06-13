package Functions;

public class Weather {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;

        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius;
        celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void printTemperatures(double fahrenheit) {
        System.out.println(fahrenheit + " temp in fahrenheit");
        double celsisu = fahrenheitToCelsius(fahrenheit);
        System.out.println(celsisu + " temp in celsius.");

    }
}
