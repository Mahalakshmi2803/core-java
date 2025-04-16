package overRide.internal;

public class Building {
    String bricks;
    String paintBrand;
    public Building() {
        System.out.println("no arg constructor of Building");
    }
    public Building(String bricks,String paintBrand){
        this.bricks=bricks;
        this.paintBrand=paintBrand;
    }
    public void show() {
        System.out.println("show running in Building");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand of Paint:"+paintBrand +"  Bricks:"+bricks;
    }
}


