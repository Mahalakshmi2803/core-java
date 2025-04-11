package overRide.internal;

public  class DiningTable extends Table {
    public DiningTable() {
        System.out.println("no arg constructor of DiningTable");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in DiningTable");
    }
    public void tableName() {
        System.out.println("tableName running in DiningTable");
    }
}
