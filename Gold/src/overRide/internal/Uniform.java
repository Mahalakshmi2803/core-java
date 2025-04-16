package overRide.internal;

public  class Uniform {
    String code;
    String colors;
    public Uniform() {
        System.out.println("no arg constructor of Uniform");
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void show() {
        System.out.println("show running in Uniform");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Code:"+code +"  Colors:"+colors;
    }
}
