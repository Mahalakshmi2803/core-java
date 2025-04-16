package overRide.internal;

public class TrafficLight {
    int noOfLights;
    String lightToStop;
    public TrafficLight() {
        System.out.println("no arg constructor of TrafficLight");
    }

    public void setLightToStop(String lightToStop) {
        this.lightToStop = lightToStop;
    }

    public void setNoOfLights(int noOfLights) {
        this.noOfLights = noOfLights;
    }

    public void show() {
        System.out.println("show running in TrafficLight");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "No of Lights:"+noOfLights +"  Light to stop:"+lightToStop;
    }
}


