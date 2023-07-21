class Human1{
    private int age = 20;
    private String name = "yogi";
    // When we use private we can't give access to any other classes to read
    // We can use or access the private varibles within the class where they are created

    // To use the private varibles in the other classes we can create the method in the same class and create an on=bject in the other class and call the method which returns the required value 

    public int getAge(){
        return age;
        // We created a method called getAge which returns the age value which is private variable
    }

    public String getName(){
        return name;
    }
}

class Human2{
    private int age;
    private String name;

    // We can't even declare variable values directly in the other class
    // We need to create a method which assigns the value to the private variable 
    public void setAge(int a){
        age = a;
        // This method is used to declare the value to the age (values are given by the other class by calling the method)
    }

    public int getAge(){
        return age;
    }

    public void setString(String b){
        name = b;
    }

    public String getName(){
        return name;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        // We can't call the age varible by using the object 
        Human1 obj = new Human1();
        // System.out.println(obj.age);
        // The above statement gives the error message as age has private access in Human
        // To avoid that we must created a method in the same class where private variables are declared ,which returns the private value to the other calsses
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        Human2 obj2 = new Human2();
        // Here the age and name are not assigned ,so we need to call the setAge and setName methods and pass the values as arguments
        obj2.setAge(21);
        // We are giving the value to the age variable which is private,by calling the method from the main class 
        obj2.setString("hari");
        System.out.println(obj2.getAge());
        System.out.println(obj2.getName());

    }
}