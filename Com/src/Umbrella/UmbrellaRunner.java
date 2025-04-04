package Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Rain rain=new Rain();
        rain.rains(null);
        Umbrella umbrella=new Umbrella();
        rain.rains(umbrella);
    }
}
