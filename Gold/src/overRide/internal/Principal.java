package overRide.internal;

public class Principal {
    String name;
    String college;
    public Principal() {
        System.out.println("no arg constructor of Principal");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void show() {
        System.out.println("show running in Principal");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  College:"+college;
    }
}


