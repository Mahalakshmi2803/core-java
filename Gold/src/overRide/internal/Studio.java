package overRide.internal;

public class Studio {
    String type;
    boolean isRecording;
    public Studio() {
        System.out.println("no arg constructor of Studio");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRecording(boolean recording) {
        isRecording = recording;
    }

    public void show() {
        System.out.println("show() running in Studio");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  Is Recording:"+isRecording;
    }
}
