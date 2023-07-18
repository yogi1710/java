class Mobile{
    String brand;
    int cost;
    static String name;


    // This block is called only once
    // Where ever the static block is created ,it is executed first 
    static{
        name = "Phone";
        System.out.println("In static block");
    }

    // This constructor is called every time when you create the object and call it  
    public Mobile(){
        brand = "";
        cost = 20000;
        System.out.println("In construcctor");
    }

    public void show(){
        System.out.println(brand+" : "+cost+" : "+name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.cost = 40000;
        obj1.name = "Smart phone";

        Mobile obj2 = new Mobile();

        obj1.show();
        obj2.show();
    }
}
