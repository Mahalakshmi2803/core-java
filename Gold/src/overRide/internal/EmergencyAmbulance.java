package overRide.internal;

public class EmergencyAmbulance extends Ambulance {
    public EmergencyAmbulance() {
        System.out.println("no arg constructor of EmergencyAmbulance");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in EmergencyAmbulance");
    }
    public void service() {
        System.out.println("service running in EmergencyAmbulance");
    }
}


