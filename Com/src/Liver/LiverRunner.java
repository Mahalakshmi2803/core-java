package Liver;

public class LiverRunner {
    public static void main(String[] args) {
        Tasks tasks=new Tasks();
        tasks.helps(null);
        Liver liver=new Liver();
        tasks.helps(liver);
    }
}
