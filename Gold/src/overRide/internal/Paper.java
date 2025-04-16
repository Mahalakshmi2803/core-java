package overRide.internal;

public class Paper {
    String length;
    String color;


    public Paper(){
        System.out.println("no arg constructor of Paper");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void size(){
        System.out.println("size running in Paper");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Length:"+length +"  Color:"+color;
    }
}
