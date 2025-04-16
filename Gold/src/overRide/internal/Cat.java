package overRide.internal;

public class Cat {
    String breed;
    String color;

    public Cat(){
        System.out.println("no arg constructor of Cat");
    }
    public Cat(String breed,String color){
        this.breed=breed;
        this.color=color;
    }

    public void hisses(){
        System.out.println("hisses running in Cat");


    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Breed:"+breed +"  Color:"+color;
    }
}
