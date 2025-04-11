package overRide.internal;

public class FinalExam extends Exam {
    public FinalExam() {
        System.out.println("no arg constructor of FinalExam");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in FinalExam");
    }
    public void examType() {
        System.out.println("examType running in FinalExam");
    }
}


