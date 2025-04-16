package overRide.internal;

public class Animal {
    String name;
    String species;
    public Animal() {
        System.out.println("no arg constructor of Animal");
    }
    public Animal(String name,String species){
        this.name=name;
        this.species=species;
    }
    public void show() {
        System.out.println("show running in Animal");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Species:"+species;
    }
}



