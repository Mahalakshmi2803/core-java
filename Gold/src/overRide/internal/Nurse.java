package overRide.internal;

public class Nurse {
    String name;
    int age;
    public Nurse() {
        System.out.println("no arg constructor of Nurse");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("show running in Nurse");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Age:"+age;
    }
}


