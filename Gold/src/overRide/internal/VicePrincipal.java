package overRide.internal;

public class VicePrincipal extends Principal {
    public VicePrincipal() {
        System.out.println("no arg constructor of VicePrincipal");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in VicePrincipal");
    }
    public void roleName() {
        System.out.println("roleName running in VicePrincipal");
    }
}


