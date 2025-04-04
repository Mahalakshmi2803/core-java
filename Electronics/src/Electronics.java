public class Electronics {
    int product_id;
    String name;
    String brand;
    float price;
    String category;
    int warranty;
    String power_source;
    String status;
    long customer_support;
    String manufacturer;
    Electronics(){}
    Electronics(int product_id,String name){
        this.product_id=product_id;
        this.name=name;
    }
    Electronics(int product_id,String name,String brand,float price){
        this(product_id,name);
        this.brand=brand;
        this.price=price;
    }
    Electronics(int product_id,String name,String brand,float price,String category,int warranty){
        this(product_id,name,brand,price);
        this.category=category;
        this.warranty=warranty;
    }
    Electronics(int product_id,String name,String brand,float price,String category,int warranty,String power_source,String status){
        this(product_id,name,brand,price,category,warranty);
        this.power_source=power_source;
        this.status=status;
    }
    Electronics(int product_id,String name,String brand,float price,String category,int warranty,String power_source,String status,long customer_support,String manufacturer){
        this(product_id,name,brand,price,category,warranty,power_source,status);
        this.customer_support=customer_support;
        this.manufacturer=manufacturer;
    }
    public void display(){
        System.out.println("The electronics product details are:\n");
        System.out.println("Product ID:\t"+this.product_id);
        System.out.println("Name:\t"+this.name);
        System.out.println("Brand:\t"+this.brand);
        System.out.println("Price:\t"+this.price);
        System.out.println("Category:\t"+this.category);
        System.out.println("Warranty:\t"+this.warranty+" years");
        System.out.println("Power Source:\t"+this.power_source);
        System.out.println("Status:\t"+this.status);
        System.out.println("Customer Support:\t"+this.customer_support);
        System.out.println("Manufacturer:\t"+this.manufacturer);
    }
}

