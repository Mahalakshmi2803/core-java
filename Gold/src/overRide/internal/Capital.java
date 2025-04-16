package overRide.internal;

public class Capital {
    String state;
    int population;
    public Capital() {
        System.out.println("no arg constructor of Capital");
    }
    public Capital(String state, int population){
        this.population=population;
        this.state=state;
    }
    public void show() {
        System.out.println("show running in Capital");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "State:"+state +"  Population:"+population;
    }
}


