package overRide.internal;



public class SpoonType extends Spoon {
    public SpoonType() {
        System.out.println("no arg constructor of SpoonType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SpoonType");
    }
    public void spoonName() {
        System.out.println("spoonName running in SpoonType");
    }
}
