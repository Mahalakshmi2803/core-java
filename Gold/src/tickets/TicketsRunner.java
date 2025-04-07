package tickets;

public class TicketsRunner {
    public static void main(String[] args) {
        SandD sandd1=new SandD("Bangalore","Delhi");
        SandD sandd2=new SandD("Chennai","Bangalore");
        SandD[] sandd={sandd1,sandd2};
        Tickets tickets=new Tickets("AirIndia",1200.8,sandd);
        tickets.display();

    }
}
