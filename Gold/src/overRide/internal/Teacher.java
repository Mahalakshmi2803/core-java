package overRide.internal;

public class Teacher {
    String name;
    String school;
    public Teacher() {
        System.out.println("no arg constructor of Teacher");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void show() {
        System.out.println("show running in Teacher");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  School:"+school;
    }
}

