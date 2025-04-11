package overRide.internal;

public class MathTeacher extends Teacher {
    public MathTeacher() {
        System.out.println("no arg constructor of MathTeacher");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in MathTeacher");
    }
    public void subjectName() {
        System.out.println("subjectName running in MathTeacher");
    }
}


