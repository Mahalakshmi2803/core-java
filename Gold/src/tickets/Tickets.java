package tickets;

public class Tickets {
    private String ticket_name;
    private double cost;
    private SandD[] sd;


    public Tickets(String ticket_name, double cost,SandD[] sd) {
        this.ticket_name = ticket_name;
        this.cost = cost;
        this.sd=sd;
    }

    public void display() {
        System.out.println("Ticket_name:" + ticket_name + "    Cost:" + cost);

        for (SandD SourceDestination : sd){
            SourceDestination.displayy();
        }
    }
}
