package overRide.internal;

public class Branch {
    String branchName;
    int year;
    public Branch() {
        System.out.println("no arg constructor of Branch");
    }
    public Branch(String branchName,int year){
        this.branchName=branchName;
        this.year=year;
    }
    public void show() {
        System.out.println("show running in Branch");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Branch Name:"+branchName +"  Current Year:"+year;
    }
}


