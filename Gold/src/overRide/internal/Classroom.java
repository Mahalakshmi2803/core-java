package overRide.internal;

public class Classroom {
    String type;
    int noOfStudents;
public Classroom() {
    System.out.println("no arg constructor of Classroom");
}
public Classroom(String type,int noOfStudents){
    this.noOfStudents=noOfStudents;
    this.type=type;
}
public void show() {
    System.out.println("show running in Classroom");
}
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:" +type+"  No of Students:"+noOfStudents;
    }
}


