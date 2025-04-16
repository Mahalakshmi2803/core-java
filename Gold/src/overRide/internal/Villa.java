package overRide.internal;

public class Villa {
    boolean isBig;
    boolean isIndependent;
    public Villa() {
        System.out.println("no arg constructor of Villa");
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    public void setIndependent(boolean independent) {
        isIndependent = independent;
    }

    public void show() {
        System.out.println("show() running in Villa");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Is Big:"+isBig +"  Is Independent:"+isIndependent;
    }
}
