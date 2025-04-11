package overRide.internal;

public class HighSchoolStudent extends Student {
    public HighSchoolStudent() {
        System.out.println("no arg constructor of HighSchoolStudent");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in HighSchoolStudent");
    }
    public void studentType() {
        System.out.println("studentType running in HighSchoolStudent");
    }
}


