public class Workbook3 {

    public static void main(String[] args) {
        int temp = 5;
        String forecast = "";

        if(temp >= -15 && temp <=-1) {
            forecast = "The forecast is FREEZING! Stay home!";
        }
        else if (temp >= 0 && temp <= 10) {
            forecast = "The forecast is Chilly. Wear a coat!";
        }
        else {
            forecast = "It's warm. Go outside!";
        }

        System.out.println(forecast);
    }
}
