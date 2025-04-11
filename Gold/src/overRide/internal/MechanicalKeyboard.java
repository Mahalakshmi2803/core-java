package overRide.internal;

public class MechanicalKeyboard extends Keyboard {
    public MechanicalKeyboard() {
        System.out.println("no arg constructor of MechanicalKeyboard");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in MechanicalKeyboard");
    }
    public void keyboardName() {
        System.out.println("keyboardName running in MechanicalKeyboard");
    }
}
