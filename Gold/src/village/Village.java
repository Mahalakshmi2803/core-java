package village;

public class Village {
    private String Name;
    private double Distance;
    private VillageCount[] pop;

    public Village(String Name,double Distance,VillageCount[] pop){
        this.Name=Name;
        this.Distance=Distance;
        this.pop=pop;
    }

    public void displayInfo(){
        System.out.println("Village Name:"+Name+"    Distance"+Distance);
        for(VillageCount pp:pop){
            pp.displayInformation();
        }
    }


}
