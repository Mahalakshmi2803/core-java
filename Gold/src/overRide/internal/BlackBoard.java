package overRide.internal;

public class BlackBoard {
    String usedTo;
    boolean easyToUse;
public BlackBoard() {
    System.out.println("no arg constructor of BlackBoard");
}
public BlackBoard(String usedTo,boolean easyToUse){
    this.easyToUse=easyToUse;
    this.usedTo=usedTo;
}
public void show() {
    System.out.println("show running in BlackBoard");
}
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Used in:"+usedTo +"  It is easy to use:"+easyToUse;
    }
}


