package overRide.internal;

public class Bell {
    String school;
    boolean timeIsUp;
public Bell() {
    System.out.println("no arg constructor of Bell");
}
public Bell(String school, boolean timeIsUp){
    this.school=school;
    this.timeIsUp=timeIsUp;
}
public void show() {
    System.out.println("show running in Bell");
}
    @Override
    public String toString(){
        System.out.println("running toString");
        return "School:"+school +"  Time is Up:"+timeIsUp;
    }
}


