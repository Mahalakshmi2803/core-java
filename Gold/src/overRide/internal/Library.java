package overRide.internal;

public class Library {
    int noOfBooks;
    boolean maintainsSilence;

    public Library() {
        System.out.println("no arg constructor of Library");
    }

    public void setMaintainsSilence(boolean maintainsSilence) {
        this.maintainsSilence = maintainsSilence;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public void show() {
        System.out.println("show running in Library");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "No of Books:"+noOfBooks +"  Maintains Silence:"+maintainsSilence;
    }
}


