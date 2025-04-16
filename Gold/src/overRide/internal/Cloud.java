package overRide.internal;

public class Cloud {
    boolean isRainy;
    boolean isSunny;
    public Cloud() {
        System.out.println("no arg constructor of Cloud");
    }
    public Cloud(boolean isRainy, boolean isSunny){
        this.isRainy=isRainy;
        this.isSunny=isSunny;
    }
    public void show() {
        System.out.println("show running in Cloud");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Rainy:"+isRainy +"  Sunny:"+isSunny;
    }
}


