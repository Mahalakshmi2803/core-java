package overRide.internal;

public class Toy {
    String material;
    boolean isAnimalToy;
    public Toy() {
        System.out.println("no arg constructor of Toy");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setAnimalToy(boolean animalToy) {
        isAnimalToy = animalToy;
    }

    public void show() {
        System.out.println("show running in Toy");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Material:"+material +"  Is an Animal Toy:"+isAnimalToy;
    }
}


