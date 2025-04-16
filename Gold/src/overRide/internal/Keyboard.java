package overRide.internal;

public class Keyboard {
    boolean isAnInstrument;
    String brand;
    public Keyboard() {
        System.out.println("no arg constructor of Keyboard");
    }

    public void setAnInstrument(boolean anInstrument) {
        isAnInstrument = anInstrument;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void show() {
        System.out.println("show running in Keyboard");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "It is an Instrument:"+isAnInstrument +"  Brand:"+brand;
    }
}


