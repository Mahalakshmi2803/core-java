package overRide.internal;

public class SmartTrafficLight extends TrafficLight {
    public SmartTrafficLight() {
        System.out.println("no arg constructor of SmartTrafficLight");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SmartTrafficLight");
    }
    public void lightType() {
        System.out.println("lightType running in SmartTrafficLight");
    }
}


