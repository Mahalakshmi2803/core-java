package overRide.internal;

public class Cup {
    String team;
    boolean wins;
    public Cup() {
        System.out.println("no arg constructor of Cup");
    }
    public Cup(String team,boolean wins){
        this.team=team;
        this.wins=wins;
    }
    public void show() {
        System.out.println("show running in Cup");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Team:"+team +"  Wins:"+wins;
    }
}


