package overRide.internal;

public class Hair {
    String type;
    String color;

    public Hair(){

        System.out.println("no args constructor Hair");

    }
    public Hair(String type,String color){
        this.color=color;
        this.type = type;
    }

    public void pin(){
        System.out.println("pin running in Hair");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  Color:"+color;
    }
}
