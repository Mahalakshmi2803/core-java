package overRide.internal;

public class CatPurrs extends Cat{


    @Override
    public void hisses(){
        System.out.println("hisses running in CatPurrs");
    }

    public void growls(){
        System.out.println("growls running in Catpurrs");

    }
}
