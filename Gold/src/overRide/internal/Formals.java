package overRide.internal;

public class Formals extends Dress {
    public Formals(){
        System.out.println("no arg constructor of Formals");
    }
    @Override
    public void code(){
        System.out.println("code running in Formals");
    }
    public void wear(){
        System.out.println("wear running in Formals");
    }
}
