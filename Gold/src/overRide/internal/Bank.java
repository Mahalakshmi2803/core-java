package overRide.internal;

public class Bank {
    String name;
    String branch;
    public Bank() {
        System.out.println("no arg constructor of Bank");
    }
    public Bank(String name,String branch){
        this.branch=branch;
        this.name=name;
    }
    public void show() {
        System.out.println("show running in Bank");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Branch:"+branch;
    }
}


