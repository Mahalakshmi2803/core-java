package overRide.internal;

public class Book extends Paper{

    public Book(){
        System.out.println("no arg constructor of Book");
    }

    @Override
    public void size(){
        System.out.println("size running in Book");
    }
    public void use(){
        System.out.println("use running in Book");
    }
}
