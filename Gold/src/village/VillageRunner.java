package village;

public class VillageRunner {
    public static void main(String[] args) {
        VillageCount vc1=new VillageCount(5000,30);
        VillageCount vc2=new VillageCount(500,3);

        VillageCount[] vc={vc1,vc2};

        Village v1=new Village("Sanikere",3.4,vc);
        v1.displayInfo();

    }
}
