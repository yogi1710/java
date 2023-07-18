class Mobile{
    String brand;
    int cost;
    static String name;

    public void show(){
        System.out.println(brand+":"+cost+":"+name);
    }
}

public class StaticInstanceVariable {
    public static void main(String[] args) {
        Mobile object1 = new Mobile();
        object1.brand = "Apple";
        object1.cost = 12000;
        // We can call the static varibles with the class names only
        Mobile.name = "Smart Phone";
        object1.show();

        Mobile object2 = new Mobile();
        object2.brand = "Lenovo";
        object2.cost = 18000;
        // We can even call the static varible with object ,but it is better to use class name.
        // we can see suggession displayed as "The static field Mobile.name should be accessed in a static way"
        object2.name = "Smart phone";
        object2.show();

        // here the name is reassigned to Phone ,the entire common names-values would be changed to phone
        // Here both the object names are changed to phone
        Mobile.name = "Phone";
    }
}
