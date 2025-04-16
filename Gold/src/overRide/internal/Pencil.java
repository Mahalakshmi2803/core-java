package overRide.internal;

public class Pencil {
    int cost;
    boolean isColorPencil;
    public Pencil() {
        System.out.println("no arg constructor of Pencil");
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setColorPencil(boolean colorPencil) {
        isColorPencil = colorPencil;
    }

    public void show() {
        System.out.println("show running in Pencil");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Cost:"+cost +"  Is Color Pencil:"+isColorPencil;
    }
}


