package overRide.internal;

public class PetAnimal extends Animal {
    public PetAnimal() {
        System.out.println("no arg constructor of PetAnimal");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in PetAnimal");
    }
    public void animalName() {
        System.out.println("animalName running in PetAnimal");
    }
}
