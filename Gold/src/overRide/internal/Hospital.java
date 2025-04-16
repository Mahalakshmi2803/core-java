package overRide.internal;

public class Hospital {
    String name;
    int noOfBranches;
    public Hospital() {
        System.out.println("no arg constructor of Hospital");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNoOfBranches(int noOfBranches){
        this.noOfBranches=noOfBranches;
    }
    public void show() {
        System.out.println("show running in Hospital");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  No of Branches:"+noOfBranches;
    }
}


