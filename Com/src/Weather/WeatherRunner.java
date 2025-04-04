package Weather;

public class WeatherRunner {
    public static void main(String[] args) {
        Condition condition=new Condition();
        condition.cool(null);
        Weather weather=new Weather();
        condition.cool(weather);
    }
}
