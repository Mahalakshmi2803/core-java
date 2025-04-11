package overRide.internal;

public class EyeLiner extends Eye{

    public EyeLiner(){
        System.out.println("no arg constructor of EyeLiner");
    }

    @Override
    public void lids(){
        System.out.println("lids running in EyeLiner");

    }

    public void curler(){
        System.out.println("curler running in EyeLiner");
    }
}
