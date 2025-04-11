package overRide.internal;

public class BluetoothSpeaker extends Speaker {
    public BluetoothSpeaker() {
        System.out.println("no arg constructor of BluetoothSpeaker");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in BluetoothSpeaker");
    }
    public void speakerName() {
        System.out.println("speakerName running in BluetoothSpeaker");
    }
}
