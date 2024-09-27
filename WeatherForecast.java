public class WeatherForecast {

    public static void main(String[] args) {

        int temp = 25;

        String forecast;

        if (temp <= -1) {
            forecast = "The weather is freezing.";
        } else if (temp <= 10) {
            forecast = "The weather is cold. ";
        } else {
            forecast = "It's kinda hot, go outside.";
        }

        System.out.println(forecast);

    }

}
