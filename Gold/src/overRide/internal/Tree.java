package overRide.internal;

public class Tree {
    String name;
    int age;
    public Tree() {
        System.out.println("no arg constructor of Tree");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("show running in Tree");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Age:"+age;
    }
}


