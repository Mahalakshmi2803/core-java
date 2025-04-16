package overRide.internal;

public class Doctor {
    String name;
    String designation;
    public Doctor() {
        System.out.println("no arg constructor of Doctor");
    }
    public Doctor(String name,String designation){
        this.name=name;
        this.designation=designation;
    }
    public void show() {
        System.out.println("show running in Doctor");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Designation:"+designation;
    }
}


