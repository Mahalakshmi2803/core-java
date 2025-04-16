package overRide.internal;

public class Speaker {
    String brand;
    boolean isVolumeHigh;
    public Speaker() {
        System.out.println("no arg constructor of Speaker");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolumeHigh(boolean volumeHigh) {
        isVolumeHigh = volumeHigh;
    }

    public void show() {
        System.out.println("show running in Speaker");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Volume is High:"+isVolumeHigh;
    }
}


