package overRide.internal;

public  class Palace {
    String name;
    boolean isGrand;
    public Palace() {
        System.out.println("no arg constructor of Palace");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrand(boolean grand) {
        isGrand = grand;
    }

    public void show() {
        System.out.println("show() running in Palace");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Is Grand:"+isGrand;
    }
}


