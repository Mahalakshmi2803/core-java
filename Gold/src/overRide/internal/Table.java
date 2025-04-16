package overRide.internal;
public class Table {
    String name;
    int noOfPeopleCanSit;
    public Table() {
        System.out.println("no arg constructor of Table");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfPeopleCanSit(int noOfPeopleCanSit) {
        this.noOfPeopleCanSit = noOfPeopleCanSit;
    }

    public void show() {
        System.out.println("show running in Table");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  No of People can sit is:"+noOfPeopleCanSit;
    }
}


