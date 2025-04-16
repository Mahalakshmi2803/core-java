package overRide.internal;

public class Student {
    String name;
    String usn;
    public Student() {
        System.out.println("no arg constructor of Student");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public void show() {
        System.out.println("show running in Student");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  USN:"+usn;
    }
}


