public class SolarsystemRunner {
    public static void main(String[] args) {
        Solarsystem solarsystem=new Solarsystem();
        solarsystem.display();
        Solarsystem solarsystem1=new Solarsystem(5,40);
        solarsystem1.display();
        Solarsystem solarsystem2=new Solarsystem(8,78,5000,80);
        solarsystem2.display();
        Solarsystem solarsystem3=new Solarsystem(9,90,6000,85,8,"micro_inverter");
        solarsystem3.display();
        Solarsystem solarsystem4=new Solarsystem(12,95,30000,92,9,"agriculture_inverter","challakere",50000);
        solarsystem4.display();
        Solarsystem solarsystem5=new Solarsystem(16,90,50000,95,12,"Electricity generator","Doddaullarthy",100000,"active",240);
        solarsystem5.display();
    }
}
