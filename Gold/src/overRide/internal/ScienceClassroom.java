package overRide.internal;

public class ScienceClassroom extends Classroom {
    public ScienceClassroom() {
        System.out.println("no arg constructor of ScienceClassroom");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in ScienceClassroom");
    }
    public void classroomName() {
        System.out.println("classroomName running in ScienceClassroom");
    }
}


