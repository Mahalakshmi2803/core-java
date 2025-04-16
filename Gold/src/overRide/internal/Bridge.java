package overRide.internal;

public class Bridge {
    String name;
    boolean isRigid;
    public Bridge() {
        System.out.println("no arg constructor of Bridge");
    }
    public Bridge(String name,boolean isRigid){
        this.isRigid=isRigid;
        this.name=name;
    }
    public void show() {
        System.out.println("show running in Bridge");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name of the Bridge:"+name +"  It is Rigid:"+isRigid;
    }
}


