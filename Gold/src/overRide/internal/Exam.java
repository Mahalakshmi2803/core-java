package overRide.internal;

public class Exam {
    String subject;
    int marks;
    public Exam() {
        System.out.println("no arg constructor of Exam");
    }
    public Exam(String subject,int marks){
        this.marks=marks;
        this.subject=subject;
    }
    public void show() {
        System.out.println("show running in Exam");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Subject:"+subject +"  Marks:"+marks;
    }
}


