package overRide.internal;

public class Snake {
    String species;
    double length;
    public Snake() {
        System.out.println("no arg constructor of Snake");
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void show() {
        System.out.println("show running in Snake");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Species:"+species +"  Length:"+length;
    }
}


